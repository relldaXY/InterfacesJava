package modelo;

import interfaces.Listador;

public class ListadorAbaixoDoAnoDesejado implements Listador{
	
	private int anoDesejado;
	
	public ListadorAbaixoDoAnoDesejado(int anoDesejado) {
		this.anoDesejado = anoDesejado;
	}
	
	public void listaCarro(String modelo, int ano) {
		if (ano < anoDesejado) {
			System.out.println("Modelo: "+ modelo + "Ano: "+ ano );
		}
		
	}
}
