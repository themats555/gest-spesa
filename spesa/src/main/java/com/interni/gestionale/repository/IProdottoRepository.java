package com.interni.gestionale.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interni.gestionale.model.Prodotto;

//A CrudRepository vanno specificati il tipo di oggetto e il suo campo chiave

@Repository
public interface IProdottoRepository extends CrudRepository<Prodotto, Integer>{

}
