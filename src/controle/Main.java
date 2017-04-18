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
/*
 * Notas de interface
 * 
 *  Funciona so na compilacao
 * 	Sao usadas para criar as formas como objetos devem realizar determinadas acoes
 *	Uma classe pode herdar varias interfaces 
 *  A partir do momento que uma classe implementa uma interface, ela deve implementar 
 *  todos os metodos dessa interface, havendo muitas classes que implementam uma dada
 *  interface, esses metodos podem ser implementados de forma diferente
 *  Definem o tipo de objeto
 */
