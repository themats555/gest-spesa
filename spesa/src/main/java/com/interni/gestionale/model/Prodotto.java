package com.interni.gestionale.model;

public class Prodotto {
	
	private int id;
	public String nome;
	public double prezzo;
	public String unita_di_misura;
	public String origine;
	public String qualita;
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
	public String getQualita() {
		return qualita;
	}
	public void setQualita(String qualita) {
		this.qualita = qualita;
	}
}
