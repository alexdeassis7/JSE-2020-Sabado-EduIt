package com.educacionit.clase4.implementaciones;

import com.educacionit.clase4.inteface.Figura;

public class Rectangulo implements Figura {
	
	private float lado;
	private float altura;

	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public float area() {

		return lado * altura;
	}
	

}
