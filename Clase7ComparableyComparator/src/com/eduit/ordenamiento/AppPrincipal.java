package com.eduit.ordenamiento;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("Carlos", "Ana", "Pedro", "Bernardo");

		System.out.println("Lista Original : " + nombres);

		Collections.sort(nombres);// ordenamos una lista cualquiera

		System.out.println("Lista Ordenanda : " + nombres);

		System.out.println("*********************************");
		Set<String> otrosNombres = new TreeSet<>();
		otrosNombres.add("Marcelo");
		otrosNombres.add("Sergio");
		otrosNombres.add("Daniel");
		otrosNombres.add("Adriana");
		otrosNombres.add("Rocio");

		System.out.println("Conjunto Ordenado " + otrosNombres);
//		Interfaz java.lang.Comparable                              

		System.out.println("---------------TRES SET DE PERSONAS--------------");
		Set<Persona> personas = new TreeSet<>();

		personas.add(new Persona(1, "Rocio"));
		personas.add(new Persona(1, "Sergio"));
		personas.add(new Persona(1, "Adriana"));
		personas.add(new Persona(1, "Daniel"));
		System.out.println("Conjunto Ordenado de personas " + personas);

		System.out.println("---------------LIST DE PERSONAS--------------");
		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Adrian"), new Persona(2, "Rocio"),
				new Persona(8, "Adriana"), new Persona(7, "Jose"));

		System.out.println("Lista de personas sin ordenar : " + otrasPersonas);
		Collections.sort(otrasPersonas , new OrdenarPorId());
		System.out.println("Lista de personas ordenanda por id : " + otrasPersonas);
	}

}
