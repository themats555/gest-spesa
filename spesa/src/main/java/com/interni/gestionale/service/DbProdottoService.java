package com.interni.gestionale.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.interni.gestionale.model.Prodotto;

@Service("mainProdottoService")
public class DbProdottoService implements IProdottoService {

	private List<Prodotto> list;
	
	private int lastId;
	
	public DbProdottoService() {
		list = new ArrayList<Prodotto>();
		list.add(new Prodotto(1,"Melanzane",2.89,"€/Kg", "Italia",3));
		list.add(new Prodotto(2,"Zucchine",2.50,"€/Kg", "Italia",4));
		list.add(new Prodotto(3,"Arance",3,"€/Kg", "Spagna",2));
		lastId = 3;
		
	}
	
	@Override
	public Iterable<Prodotto> getAll() {
		
		return list;
		
	}

	@Override
	public Optional<Prodotto> getById(int id) {
		
		Optional<Prodotto> prodotto = list.stream().filter(item -> item.getId() == id).findFirst();
		
		return prodotto;
	}

	@Override
	public Prodotto create(Prodotto prodotto) {
		
		lastId++;
		
		prodotto.setId(lastId);
		
		list.add(prodotto);
		
		return prodotto;
	}

	@Override
	public Optional<Prodotto> update(int id, Prodotto prodotto) {
		
		Optional<Prodotto> foundProdotto = list.stream().filter(item -> item.getId() == id).findFirst();
	
		foundProdotto.get().setPrezzo(prodotto.getPrezzo());
		
		return foundProdotto;
	}

	@Override
	public Boolean delete(int id) {
		
		Optional<Prodotto> foundProdotto = list.stream().filter(item -> item.getId() == id).findFirst();
		
		if (foundProdotto.isEmpty()) {
			return false;
		}
		
		list.remove(foundProdotto.get());
		
		return true;
	}

}
