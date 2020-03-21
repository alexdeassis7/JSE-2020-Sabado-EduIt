package com.educacionit.clase3;

import java.util.Scanner;

//Clase hijo que hereda de Vuelo

public class VueloCarga extends Vuelo {
	
	// total de asientos
	public int asientos = 12;
	// pies cubicos de espacio en la bodega
	public float espacioMaximoDeCarga = 1000;
	// usamos esta variable para ver la cantidad de espacio de bodega
	public float espacioDeCargaUsado;
	//Implementacion del metodo abstracto de la clase padre 
	public void venderBoletos() {
		Scanner teclado = new Scanner(System.in);
		int cantidadBoletosAcomprar ;
		System.out.println(" cuanto boletos desea comprar y cual es el medio de pago ");
		cantidadBoletosAcomprar = teclado.nextInt();
		
		if (getAsiento() > cantidadBoletosAcomprar) {
			System.out.println(" tiene sus boletos buen viaje");
		}else {
			System.out.println("no queda tanto boletos a la venta por favor busqeu otra aerolinea , thanks");
		}
		
	}
	
	
	/// metodo para agregar un paquete a la bodega de nuestro avion
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;
		if (espacioDeCargaDisponible(size)) {
			espacioDeCargaUsado += size;
			System.out.println("ya esta su encomienda a bordo , gracias , vuelvas pronto");
		} else {
			faltaEspacio();
		}

	}
	// metodo privado que imprime mensaje de falta de espacio
	private void faltaEspacio() {
		System.out.println("NO tenemos mas espacio en las bodegas , BYE BYE ,");
	}
	// metodo privado para asegurarnos de que tenemos suficiente
	// espacio para el paquete que intentamos agregar al avion!
	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioDeCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	@Override
	public int getAsiento() {
		return 12;
	}
}
