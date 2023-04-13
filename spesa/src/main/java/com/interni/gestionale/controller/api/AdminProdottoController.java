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
	private IProdottoService prodottoService;
	
	public AdminProdottoController() {
		
	}
	
	@RequestMapping("/admin/api/prodotti")
	public Iterable<Prodotto> getAll() {
		
		return prodottoService.getAll();
	}
	
	@RequestMapping("/admin/api/prodotto/{id}")
	public Prodotto getById(@PathVariable int id) {
		
		Optional<Prodotto> photo = prodottoService.getById(id);
		
		return photo.get();
	}
	
	@RequestMapping(value = "/admin/api/prodotto", method = RequestMethod.POST)
	public Prodotto create(Prodotto prodotto) {
		
		return prodottoService.create(prodotto);
	}
	
	@RequestMapping(value = "/admin/api/prodotto/{id}", method = RequestMethod.PUT)
	public Prodotto update(@PathVariable int id, Prodotto prodotto) {
		
		Optional<Prodotto> updatedProdotto = prodottoService.update(id, prodotto);
		
		return updatedProdotto.get();
	}
	
	@RequestMapping(value = "/admin/api/prodotto/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		
		prodottoService.delete(id);

	}
}
