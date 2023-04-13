package com.interni.gestionale.service;

import java.util.Optional;

import com.interni.gestionale.model.Prodotto;

public interface IProdottoService {

	public Iterable<Prodotto> getAll();
	
	public Optional<Prodotto> getById(int id);
	
	public Prodotto create(Prodotto prodotto);
	
	public Optional<Prodotto> update(int id, Prodotto photo);
	
	public Boolean delete(int id);
}
