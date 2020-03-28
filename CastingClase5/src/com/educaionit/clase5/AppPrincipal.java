package com.educaionit.clase5;

public class AppPrincipal {

	public static void main(String[] args) {

//		int a = 1;
//		double b = 2.5;
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
////		b = a; //casteo implicito
//		a = (int)b; //casteo explicito
//		System.out.println("*****************************");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		//ERROR QUE SE GENERA CUANDO CASTEO ALGO QUE NO SE PUEDE > por ejemplo un int a personaType mismatch :cannot convert from (int) to (String)
		
		int codigoProducto= 88;
		
		char codigoASCII = (char)codigoProducto;
		
		System.out.println(codigoASCII);
		
		
		
		
		

	}

}
