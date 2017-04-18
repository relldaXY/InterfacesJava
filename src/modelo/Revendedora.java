package modelo;

import interfaces.Listador;

public class Revendedora {
	  private Carro[] estoque;
	  int qtd = 0;

	  public Revendedora() {
	    estoque = new Carro[1000];
	    estoque[0] = new Carro("uno",2008);
	    estoque[1] = new Carro("gol",2010);
	    qtd = 2;
	  }

	  public void addCarro(Carro x) {
	    estoque[qtd] = x;
	    qtd++;
	  }

	  public void removeCarro(Carro x) { 
	    removeCarro(indexOf(x));
	  }
	  
	  private void removeCarro(int k) {
	    if (k < 0) 
	    	return;
	    qtd--;
	    estoque[k] = estoque[qtd]; //transfere o carro da ultima posicao do array para a posicao de onde o carro foi removido
	    return;
	  }
	  
	  private int indexOf(Carro x) {
	    for(int i = 0; i < qtd; i++) {
	    	if(estoque[i] == x) 
	    		return i;
	    }
	    return -1;
	  }

	  public void listar(Listador v) {
	    for(int i = 0; i < qtd; i++) {
	      estoque[i].imprimir(v);
	    }
	  }

	  
}