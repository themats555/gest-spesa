package com.interni.gestionale.controller.api;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interni.gestionale.model.Prodotto;
import com.interni.gestionale.service.IProdottoService;

@RestController
public class AdminProdottoController {

	@Autowired
	@Qualifier("mainProdottoService")
	private IProdottoService ProdottoService;
	
	public AdminProdottoController() {
		
	}
	
	@RequestMapping("/admin/api/Prodottos")
	public Iterable<Prodotto> getAll() {
		
		return ProdottoService.getAll();
	}
	
	@RequestMapping("/admin/api/Prodottos/{id}")
	public Prodotto getById(@PathVariable int id) {
		
		Optional<Prodotto> prodotto = ProdottoService.getById(id);
		
		return prodotto.get();
	}
	
	@RequestMapping(value = "/admin/api/Prodottos", method = RequestMethod.POST)
	public Prodotto create(Prodotto Prodotto) {
		
		return ProdottoService.create(Prodotto);
	}
	
	@RequestMapping(value = "/admin/api/Prodottos/{id}", method = RequestMethod.PUT)
	public Prodotto update(@PathVariable int id, Prodotto Prodotto) {
		
		Optional<Prodotto> updatedProdotto = ProdottoService.update(id, Prodotto);
		
		return updatedProdotto.get();
	}
	
	@RequestMapping(value = "/admin/api/Prodottos/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		
		ProdottoService.delete(id);

	}
	
}
