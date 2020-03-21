package com.educacionit.modelos;

public class Futbolista extends SeleccionFutbol{
	
	private String demarcacion;
	private int dorsal;
	
	//Constructor vacio
	public Futbolista() {		
	}		
	//utilizo constructor de la clase padre
	public Futbolista(String demarcacion ,int dorsal ,int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.demarcacion = demarcacion;
		this.dorsal = dorsal;
		
	}


	public void jugarPartido() {
		System.out.println("(Clase hija) estoy jugando el partido");
	}
	public void entrenar() {
		System.out.println("(Clase hija) estoy entrenando para el partido");
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
