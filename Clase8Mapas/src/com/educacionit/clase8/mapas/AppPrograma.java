package com.educacionit.clase8.mapas;

import java.util.*;

public class AppPrograma {

	public static void main(String[] args) {
		// Implementacion HashMap
		// Con clave "Integer" y valor "String"
		System.out.println("***********************HashMap*****************");
		Map<Integer, String> Jugadores = new HashMap<Integer, String>();
		System.out.println("size:" + Jugadores.size()); // Devuelve el numero de elemento de Map
		Jugadores.isEmpty(); // Devuelve true si no hay elemento y false si los hay
		// agregamos elemneto al Map
		Jugadores.put(1, "Casillas");
		Jugadores.put(15, "Ramos");
		Jugadores.put(3, "Pique");
		Jugadores.put(5, "Puyol");
		Jugadores.put(11, "Capdevila");
		Jugadores.put(14, "Xabi Alonso");
		Jugadores.put(16, "Busquets");
		Jugadores.put(8, "Xavi Hernandez");
		Jugadores.put(18, "Pedrito");
		Jugadores.put(6, "Iniesta");
		Jugadores.put(7, "Villa");
		System.out.println("size:" + Jugadores.size());
		// Imprimimos el Map con un Iterador
		Iterator it = Jugadores.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + Jugadores.get(key));

		}
		// Implementacion TreeMap
		System.out.println("***********************TreeMap*****************");
		Map<Integer, String> JugadoresTree = new TreeMap<Integer, String>();
		// agregamos elemneto al Map
		JugadoresTree.put(1, "Casillas");
		JugadoresTree.put(15, "Ramos");
		JugadoresTree.put(3, "Pique");
		JugadoresTree.put(5, "Puyol");
		JugadoresTree.put(11, "Capdevila");
		JugadoresTree.put(14, "Xabi Alonso");
		JugadoresTree.put(16, "Busquets");
		JugadoresTree.put(8, "Xavi Hernandez");
		JugadoresTree.put(18, "Pedrito");
		JugadoresTree.put(6, "Iniesta");
		JugadoresTree.put(7, "Villa");
		// Imprimimos el Map con un Iterador
		 it = JugadoresTree.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + JugadoresTree.get(key));
		}
		// Implementacion LinkedHashMap
		System.out.println("***********************LinkedHashMap*****************");
		Map<Integer, String> JugadoresLinked = new LinkedHashMap<Integer, String>();
		// agregamos elemneto al Map
		JugadoresLinked.put(1, "Casillas");
		JugadoresLinked.put(15, "Ramos");
		JugadoresLinked.put(3, "Pique");
		JugadoresLinked.put(5, "Puyol");
		JugadoresLinked.put(11, "Capdevila");
		JugadoresLinked.put(14, "Xabi Alonso");
		JugadoresLinked.put(16, "Busquets");
		JugadoresLinked.put(8, "Xavi Hernandez");
		JugadoresLinked.put(18, "Pedrito");
		JugadoresLinked.put(6, "Iniesta");
		JugadoresLinked.put(7, "Villa");
		// Imprimimos el Map con un Iterador
		 it = JugadoresLinked.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + JugadoresLinked.get(key));
		}
		

	}

}
