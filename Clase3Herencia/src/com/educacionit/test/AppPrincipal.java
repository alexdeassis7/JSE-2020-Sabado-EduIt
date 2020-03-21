package com.educacionit.test;

import java.util.ArrayList;
import com.educacionit.modelos.*;

public class AppPrincipal {
	// ArrrayList de objetos Seleccion futbol.
	// independientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		// instanciamos objetos de las clase hijas
		Entrenador delBosque = new Entrenador("21E256", 1, "Vicente", "del Bosque", 65);
		Futbolista iniesta = new Futbolista("interior derecho ", 8, 2, "Andres", "Iniesta", 32);
		Masajista raulMartinez = new Masajista("Licenciado en Fisioterapia deportiva", 10, 3, "Raul", "Martinez", 45);

		// agreganmos todos los objetos a nuestro ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		// FOR EACH : sirve para iterar colecciones de objetos
		//System.out.println("los integrantes comienzan la concentracion (todos ejecutan el mismo metodo)\n");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println("**********************");
			System.out.print(integrante.getNombre() + "" + integrante.getApellido());
			integrante.concentrarse();
			
			integrante.jugarPartido();
			integrante.ruedaPrensa();
			integrante.entrenar();
		}
//
//		// VIAJE
//		System.out.println("\nlos integrantes viajan a jugar un partido (todos ejecutan el mismo metodo)\n");
//		for (SeleccionFutbol integrante : integrantes) {
//			System.out.print(integrante.getNombre() + "" + integrante.getApellido());
//			integrante.viajar();
//		}
//		
//		SeleccionFutbol sc = new SeleccionFutbol(23, "Española", "gallega", 59);
//		
//		// ENTRENAMIENTO
//		System.out.println("\n Entrenamiento solamente el entrenador y el jugador posen metodos para entrenar");
//		
//		System.out.print(delBosque.getNombre() + "" + delBosque.getApellido());
//		delBosque.dirigirEntrenamiento();
//		
//		System.out.print(iniesta.getNombre() + "" + iniesta.getApellido());
//		iniesta.entrenar();
//		
//		//MASAJE
//		System.out.println("\n solo el masajista puede dar masajes");
//		raulMartinez.darMasaje();
//		
//		//PARTIDO DE FUTBOL
//		System.out.println("\n Partido Futbol :solo el entrenador y futbolista puedem tienen metodo para el partido de futbol");
//		System.out.print(delBosque.getNombre() + "" + delBosque.getApellido());
//		delBosque.dirigirPartido();
//		
//		System.out.print(iniesta.getNombre() + "" + iniesta.getApellido());
//		iniesta.jugarPartido();
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
				
		
		

	}

}
