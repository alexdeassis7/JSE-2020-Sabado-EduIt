package com.eduit.ordenamiento;

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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public int compareTo(Persona o) {
		
		return this.nombre.compareTo(o.nombre);
	}

}
