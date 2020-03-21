package com.educacionit.clase3;

public class Passenger {

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalAPagar;
	private int totalEquipaje;
	private String nombre;

	// Constructor Vacio
	public Passenger() {
	}

	// Constructor 2 con un parametro que llama al constructor privado
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);// operador ternario , ifElse Inline
		this.bolsos = bolsos;
		totalAPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// Constructor 3 con dos parametros :este llama al constructor 2 que a su vez
	// invoca alconstructor privado
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalAPagar = bolsos * tarifaXbolso;
	}

	// Cosntructor 4 privado
	private Passenger(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	}

	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalAPagar() {
		return totalAPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("******************************************");
			System.out.println("Pasajero tarifa por Bolso : " + p1.getTarifaXbolso());
			System.out.println("Pasajero total a pagar : " + p1.getTotalAPagar());
			System.out.println("Pasajero total de bolsos : " + p1.getTotalEquipaje());

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
