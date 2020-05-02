package com.educacionit.genericos;

public class MainGenerico {

	public static void main(String[] args) {
		// instanciamos una bolsa generica
		BolsaGenerica<Golosina> bolsa = new BolsaGenerica<Golosina>(5);

		Golosina c = new Golosina("caramelo");
		Golosina c1 = new Golosina("Hamlet");
		Golosina c2 = new Golosina("Rapa Nui");
		Golosina c3 = new Golosina("Cofler");

		bolsa.add(c3);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c);

		for (Golosina aux : bolsa) {
			System.out.println(aux.getNombre());
		}

	}

}
