package com.educacionit.modelos;

public class Entrenador extends SeleccionFutbol {
	private String id_federacion;

	// Constructor vacio
	public Entrenador() {
	}
	// constructor con todos los parametros
	public Entrenador(String id_federacion, int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.id_federacion = id_federacion;
	}

	public void dirigirPartido() {
		System.out.println("(Clase hija) estoy dirigiendo un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("(Clase hija) estoy dirigiendo un entrenamiento");
	}

	public String getId_federacion() {
		return id_federacion;
	}

	public void setId_federacion(String id_federacion) {
		this.id_federacion = id_federacion;
	}

}
