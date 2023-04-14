package com.interni.gestionale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Entity indica a spring che questa e' una classe che rappresenta una tabella nel db

@Entity
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public String nome;

	public double prezzo;

	public String unita_di_misura;

	public String origine;

	public int qualita;
	
//	public Prodotto(int i, String string, double d, String string2, String string3, int j) {
//		
//
//		id = i;
//		nome = string;
//		prezzo = d;
//		unita_di_misura = string2;
//		origine = string3;
//		qualita = j;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getUnita_di_misura() {
		return unita_di_misura;
	}
	public void setUnita_di_misura(String unita_di_misura) {
		this.unita_di_misura = unita_di_misura;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public int getQualita() {
		return qualita;
	}
	public void setQualita(int qualita) {
		this.qualita = qualita;
	}
}
