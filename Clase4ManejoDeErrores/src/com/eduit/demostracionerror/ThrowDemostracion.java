package com.eduit.demostracionerror;

public class ThrowDemostracion {

	public static void main(String[] args) {

//		Calculadora c = new Calculadora();
//		try {
//		c.dividir(45, 0);
//		}catch (ArithmeticException e) {
//			System.out.println("no podes dividir por cero ");
//		}
//		
//		
//		
		
		
		try {
			System.out.println("antes de lanzar la exception ");
			// lanzamos una exception
			throw new MiPropiaExcetions("soy un mesaje de error enviado desde otra clase ");
			
//			System.out.println("luego de forzar un error ");
		
		} catch (MiPropiaExcetions e) {
			// capturo un error
			System.out.println("Exception capturada");
			System.out.println(e.getMessage());
		}

		System.out.println("finalizamos el bloque try catch ");

	}

}
