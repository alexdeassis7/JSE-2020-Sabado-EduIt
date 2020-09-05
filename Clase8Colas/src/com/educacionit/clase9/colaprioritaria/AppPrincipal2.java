package com.educacionit.clase9.colaprioritaria;

import java.util.PriorityQueue;

public class AppPrincipal2 {
	public static void main(String[] args) {
		// PRIORITY QUEUE
		// creamos el obejtos de la clase PriorityQueue
		// y le indicamos que almacene object de la clase Integer
		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
		//cargamos la cola 
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(177);
		cola1.add(788);

		System.out.println("imprimimos la cola con prioridades de enteros");

		while (!cola1.isEmpty()) {
			System.out.print(cola1.poll() + " - ");
		}

	}

}
