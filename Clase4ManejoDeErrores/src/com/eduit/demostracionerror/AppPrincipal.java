package com.eduit.demostracionerror;

public class AppPrincipal {

	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		System.out.println(" Antes de hacer la division");

		try {
			// intenta ejecutar este bloque de codigo
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			// instrucciones a ejecutar si se produce una Exception
			division = 0;
			System.out.println("mostramos el mensaje " + ex.getMessage());

		} catch (NullPointerException e) {
			division = 1;
			System.out.println("mostramos el mensaje " + e.getMessage());
		} finally {
			// Instrucciones que se ejecutan , tanto si hay como sino hay excepciones
			System.out.println("Resultado =" + division);
			System.out.println(" despues de hacer la division ");
		}

	}

}
