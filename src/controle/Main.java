package controle;

import interfaces.Listador;
import modelo.ListadorAbaixoDoAnoDesejado;
import modelo.ListadorAcimaDoAnoDesejado;
import modelo.Revendedora;

public class Main {

	public static void main(String[] args) {
		Revendedora r = new Revendedora();
		
		Listador acimaDoAno = new ListadorAcimaDoAnoDesejado(2009);
		Listador abaixoDoAno = new ListadorAbaixoDoAnoDesejado(2009);
		
		System.out.println("Acima do ano desejado");
		r.listar(acimaDoAno);
		
		System.out.println("Abaixo do ano desejado:");
		r.listar(abaixoDoAno);

	}

}
