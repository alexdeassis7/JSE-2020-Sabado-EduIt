package com.educacionit.clase4.implementaciones;

import com.educacionit.clase4.inteface.Figura;

public class Cuadrado implements Figura {
	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float area() {
		
		return lado * lado;
	}


}
