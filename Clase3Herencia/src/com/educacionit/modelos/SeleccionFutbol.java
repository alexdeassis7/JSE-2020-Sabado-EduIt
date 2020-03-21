package com.educacionit.modelos;

import com.educacionit.interfaces.IntegrantesSeleccionFutbol;

//Clase Padre 
public class SeleccionFutbol implements IntegrantesSeleccionFutbol{

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	// Constructor vacio
	public SeleccionFutbol() {

	}

	// Constructor con parametros
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("(Clase Padre ) estoy concentrando");
	}

	public void viajar() {
		System.out.println("(Clase Padre ) estoy Viajando");
			
	}
	@Override
	public void entrenar() {
		System.out.println("entrenando desde la seleccion de futbol");
		
	}

	@Override
	public void jugarPartido() {
		System.out.println("Jugando desde la seleccion de futbol");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
	
}