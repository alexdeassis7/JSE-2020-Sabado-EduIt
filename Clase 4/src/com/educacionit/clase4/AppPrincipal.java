package com.educacionit.clase4;

import com.educacionit.clase4.implementaciones.Circulo;
import com.educacionit.clase4.implementaciones.Cuadrado;
import com.educacionit.clase4.implementaciones.Rectangulo;
import com.educacionit.clase4.inteface.Figura;
//JDK 1.8 SE agrega el metodo DEFAULT

public class AppPrincipal {
	public static void main(String[] args) {
		Figura cuad1 =  new Cuadrado(3.5f);
		Figura cuad2 =  new Cuadrado(2.1f);
		Figura cuad3 =  new Cuadrado(8.5f);
		System.out.println("area cuad3 = " +cuad3.area());
		
		Figura circ1 = new Circulo(3.6f);
		Figura circ2 = new Circulo(4f);
		System.out.println("area circ2 = " + circ2.area());
		
		Figura rect1 = new Rectangulo(2.26f, 2.57f);
		Figura rect2 = new Rectangulo(11f, 2f);
		System.out.println("area rect2 = " + rect2.area());
		
		
	}
	
}
