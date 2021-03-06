package com.educacionit.modelos;

public class PersonaVO {
	// Clase PersonaVO patron VAlue Object (Anteriormente conocido como DTO Data Transfer Object)

	private Integer idPersona;
	private Integer edadPersona;
	private Integer telefonoPersona;
	private String nombrePersona;
	private String profesionPersona;

	public PersonaVO() {}

	public PersonaVO(Integer idPersona, Integer edadPersona, Integer telefonoPersona, String nombrePersona,
			String profesionPersona) {
		this.idPersona = idPersona;
		this.edadPersona = edadPersona;
		this.telefonoPersona = telefonoPersona;
		this.nombrePersona = nombrePersona;
		this.profesionPersona = profesionPersona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", edadPersona=" + edadPersona + ", telefonoPersona="
				+ telefonoPersona + ", nombrePersona=" + nombrePersona + ", profesionPersona=" + profesionPersona + "]";
	}
	
	

}
