package com.eduit.ordenamiento;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
	
		return p1.getIdPersona() - p2.getIdPersona();
	}
	
//	p1 < p2  = devuelve iun numero menor a cero
//	p1 == p2  = retorna cero
//	p1 > p2  = retorna un numero mayor a cero 
			
}
