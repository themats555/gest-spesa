package com.interni.gestionale.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interni.gestionale.model.Prodotto;
import com.interni.gestionale.repository.IProdottoRepository;




//viene dato un nome al service in modo tale che si possa instanziare l'oggetto IProdottoService 
//nel controller e non la classe che lo implementa. Questo nel caso si abbiano più classi che 
//implementano la stessa interfaccia

@Service("mainProdottoService")
public class DbProdottoService implements IProdottoService {

	@Autowired
	private IProdottoRepository prodottoRepository;
	
	//private List<Prodotto> list;
	
	//private int lastId;
	
//	public DbProdottoService() {
//		list = new ArrayList<Prodotto>();
//		list.add(new Prodotto(1,"Melanzane",2.89,"€/Kg", "Italia",3));
//		list.add(new Prodotto(2,"Zucchine",2.50,"€/Kg", "Italia",4));
//		list.add(new Prodotto(3,"Arance",3,"€/Kg", "Spagna",2));
//		lastId = 3;
//		
//	}
	
	@Override
	public Iterable<Prodotto> getAll() {
		
		return prodottoRepository.findAll();
		
	}

	@Override
	public Optional<Prodotto> getById(int id) {
		
		//Optional<Prodotto> prodotto = list.stream().filter(item -> item.getId() == id).findFirst();
		
		return prodottoRepository.findById(id);
	}

	@Override
	public Prodotto create(Prodotto prodotto) {
		
		//lastId++;
		
		//prodotto.setId(lastId);
		
		//list.add(prodotto);
		
		return prodottoRepository.save(prodotto);
	}

	@Override
	public Optional<Prodotto> update(int id, Prodotto prodotto) {
		
		//Optional<Prodotto> foundProdotto = list.stream().filter(item -> item.getId() == id).findFirst();
	
		//foundProdotto.get().setPrezzo(prodotto.getPrezzo());
		
		Optional<Prodotto> foundProdotto = prodottoRepository.findById(id);
		
		foundProdotto.get().setPrezzo(prodotto.getPrezzo());
		
		prodottoRepository.save(foundProdotto.get());
		
		return foundProdotto;
	}

	@Override
	public Boolean delete(int id) {
		
		//Optional<Prodotto> foundProdotto = list.stream().filter(item -> item.getId() == id).findFirst();
		
//		if (foundProdotto.isEmpty()) {
//			return false;
//		}
		
		
		//list.remove(foundProdotto.get());
		
		Optional<Prodotto> foundProdotto = prodottoRepository.findById(id);
		
		if (foundProdotto.isEmpty()) {
			return false;
		}
		
		prodottoRepository.delete(foundProdotto.get());
		
		return true;
	}

}
