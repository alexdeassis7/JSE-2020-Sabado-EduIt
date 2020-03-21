package com.educacionit.clase3;

//Clase Padre
public abstract class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// Inicializador de Bloque
	{
		// disponibilizador de butadas
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < asientosDisponibles.length; i++) {
			asientosDisponibles[i] = true;
			// System.out.println("estamos disponibilizando la butaca " + (i+1));
		}

	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {

	}

	public Vuelo(int numVuelo) {

	}
	//Defino un metod abstracto 
	public abstract void venderBoletos();

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros++;
			System.out.println("subimos al pasajero " + p1.getNombre());
		} else {
			faltaAsiento();
		}

	}

	public void faltaAsiento() {
		System.out.println("no tenemos sufientes butacas disponibles, busque otra aerolinea");
	}

	public boolean asientoDisponible() {
		// valida que el numero de pasajeros sean
		// menos que los asientos
		return pasajeros < getAsiento();
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;// 150 es la cantidad de asientos
	}
}
