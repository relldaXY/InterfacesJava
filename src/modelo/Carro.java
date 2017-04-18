package modelo;

import interfaces.Listador;

public class Carro {
	private int ano;
	private String modelo;
	
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void imprimir(Listador v) {
	    v.listaCarro(modelo, ano);
	}
}
