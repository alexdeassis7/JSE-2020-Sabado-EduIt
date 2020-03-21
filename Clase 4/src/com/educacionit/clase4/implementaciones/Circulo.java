package com.educacionit.clase4.implementaciones;

import com.educacionit.clase4.inteface.Figura;

//circulo implementa la interfaz figura
public class Circulo implements Figura {

	private float diametro;

	public Circulo(float diametro) {
		this.diametro = diametro;
	}

	// implementamos el metodo abstracto de la interface
	@Override
	public float area() {
		// calculamos el area del Circulo
		return PI * diametro * diametro / 4f;
	}

}
