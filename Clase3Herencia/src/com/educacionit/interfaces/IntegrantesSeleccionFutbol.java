package com.educacionit.interfaces;

public interface IntegrantesSeleccionFutbol {
	void concentrarse();
	void viajar ();
	void entrenar();
	void jugarPartido();
	
	default void ruedaPrensa() {
		System.out.println("Da una rueda de prensa (DESDE LA INTEFACE)");
	}
	
}
