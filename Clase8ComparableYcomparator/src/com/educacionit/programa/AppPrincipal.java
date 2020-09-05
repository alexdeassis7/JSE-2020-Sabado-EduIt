package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.modelos.OrdenarPorId;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
//		List<String> nombres =Arrays.asList("Carlos","Ana","Dionisio","Bernardo");
//		System.out.println("Lista original :" + nombres );
//		Collections.sort(nombres);
//		System.out.println("Lista original :" + nombres );
//		
//		Set<String> otrosNombres = new TreeSet<>();
//		otrosNombres.add("Alex");
//		otrosNombres.add("Mario");
//		otrosNombres.add("Fernando");
//		otrosNombres.add("Omar");
//		otrosNombres.add("Juana");		
//		System.out.println(otrosNombres);

		Set<Persona> personas = new TreeSet<>();
		
		personas.add(new Persona(1, "Mario"));
		personas.add(new Persona(2, "Fernando"));
		personas.add(new Persona(3, "Omar"));
		personas.add(new Persona(4, "Juana"));

		System.out.println("conjunto ordenado de personas : " + personas);

		List<Persona> otrasPersonas= Arrays.asList(new Persona(4, "Juana"),new Persona(2, "Fernando"),
				new Persona(1, "Mario"),new Persona(3, "Omar"));
		System.out.println("lista de personas sin orden  : " + otrasPersonas);
		Collections.sort(otrasPersonas, new OrdenarPorId());
		System.out.println("list de personas Ordenadas por ID  : " + otrasPersonas);
		
		
		Set<Persona> conjuntoPersonas = new TreeSet<>(new OrdenarPorId());
		conjuntoPersonas.add(new Persona(3, "Omar"));
		conjuntoPersonas.add(new Persona(4, "Juana"));
		conjuntoPersonas.add(new Persona(2, "Fernando"));
		conjuntoPersonas.add(new Persona(1, "Mario"));
		System.out.println("TreeSet de personas Ordenadas por ID  : " + conjuntoPersonas);
		
		
	}

}
