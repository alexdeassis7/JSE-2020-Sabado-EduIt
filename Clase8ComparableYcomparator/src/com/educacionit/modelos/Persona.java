package com.educacionit.modelos;

import java.util.Date;

public class Persona implements Comparable<Persona>{
	private int idPersona;
	private String nombre;
	private Date fechaNacimiento;

	public Persona(int idPersona, String nombre) {
		this.idPersona = idPersona;
		this.nombre = nombre;	
	}	
	public Persona() {
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNaciemiento() {
		return fechaNacimiento;
	}
	public void setFechaNaciemiento(Date fechaNaciemiento) {
		this.fechaNacimiento = fechaNaciemiento;
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	@Override
	public String toString() {
		return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona , nombre);
	}
}
