package com.eduit.clase13;


public class Main {

	public static void main(String[] args) {
		MiValor mival;
		mival = () -> 28.6;

		MiValor mival2 = () -> 3.8;

		System.out.println("Un valor constante : " + mival.getValor());
		System.out.println("Un valor constante : " + mival2.getValor());
		
		//Usamos la interfaz funcional para implementar un lambda reciproca
		MiValParam miValor2 = (double n) -> 1.0 / n;
		System.out.println("EL reciproco de 4.0 es : " + miValor2.getValor(4.0));
	}

}
