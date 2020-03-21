package com.educacionit.modelos;

public class Masajista extends SeleccionFutbol{
	
	private String titulacion;
	private int aniosDeExperiencia;
	
	//Constructor vacio
	public Masajista() {

	}
	// constructor con todos los parametros
	public Masajista(String titulacion , int aniosDeExperiencia ,int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosDeExperiencia = aniosDeExperiencia;
		
	}
	// METODO PROPIO DE LA CLASE MASAJISTA
	public void darMasaje() {
		System.out.println("(Clase hija) estoy dando masajes");
	}

	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}
	public void setAniosDeExperiencia(int aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}
}
