package com.educacionit.genericos;

public class Main {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(4);

		Chocolate c = new Chocolate("ferrero");
		Chocolate c1 = new Chocolate("Hamlet");
		Chocolate c2 = new Chocolate("Rapa Nui");
		Chocolate c3 = new Chocolate("Cofler");
		Golosina g = new Golosina("Chicle");
		Golosina g1 = new Golosina("Chupetin");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3);
		bolsa.add(g1);
		bolsa.add(g);

		for (Object o : bolsa) {
			if (o instanceof Chocolate) {
				Chocolate choco = (Chocolate) o;
				System.out.println(choco.getMarca());
			} else {
				Golosina golo = (Golosina) o;
				System.out.println(golo.getNombre());
			}

		}

	}

}
