package com.educacionit.models;

public class PersonaVO {
	
	private String idName;
	private int password;

	public PersonaVO() {
	}

	public PersonaVO(String idName, int password) {

		this.idName = idName;
		this.password = password;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

}
