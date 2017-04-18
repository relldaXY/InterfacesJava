package modelo;

import interfaces.Listador;

public class ListadorAcimaDoAnoDesejado implements Listador{
	
	private int anoDesejado;
	
	public ListadorAcimaDoAnoDesejado(int anoDesejado) {
		this.anoDesejado = anoDesejado;
	}
	
	@Override
	public void listaCarro(String modelo, int ano) {
		if (ano > anoDesejado) {
			System.out.println("Modelo: "+ modelo + "Ano: "+ ano );
		}
		
	}
	
}
