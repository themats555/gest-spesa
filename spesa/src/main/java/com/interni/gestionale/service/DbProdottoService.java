package com.interni.gestionale.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.interni.gestionale.model.Prodotto;

@Service("mainProdottoService")
public class DbProdottoService implements IProdottoService {

	@Override
	public Iterable<Prodotto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Prodotto> getById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Prodotto create(Prodotto prodotto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Prodotto> update(int id, Prodotto photo) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
