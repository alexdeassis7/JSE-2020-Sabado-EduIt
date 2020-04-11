package com.eduit.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AppPrincipal {

	public static void main(String[] args) {
//		
//		int[] numeros = new int[10];
////		
//		numeros[0] = 12;
//		numeros[1] = 23;
//		numeros[2] = 34;
////		numeros[3]=45;	0	
//		numeros[4] = 34;
//		numeros[5] = 12;
//		numeros[6] = 12;
////		numeros[7]=456; 0
//		numeros[8] = 67;
//		numeros[9] = 67;
//		numeros[25] = 45;
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}	
		// no se deben usar primitivos
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento 2");
		System.out.println("size : " + nombreArrayList.size());

		nombreArrayList.add("Elemento 3");
		nombreArrayList.add("Elemento 4");
		nombreArrayList.add("Elemento 5");
		nombreArrayList.add("Elemento 6");

		System.out.println("get(1) : " + nombreArrayList.get(1));
		;

		System.out.println("contiene el Elemento 4?" + nombreArrayList.contains("Elemento 4"));

		System.out.println("Primer posicion Elemento 2: " + nombreArrayList.indexOf("Elemento 2"));

		System.out.println("size : " + nombreArrayList.size());
		System.out.println("Borrarmos el elemento de la posicion 5  :" + nombreArrayList.remove(5));
		;
		System.out.println("Borrarmos el elemento de la posicion 3  :" + nombreArrayList.remove(3));
		;
		System.out.println("size : " + nombreArrayList.size());

		System.out.println(nombreArrayList.remove("Elemento"));
		System.out.println("size : " + nombreArrayList.size());

		System.out.println("get 0 " + nombreArrayList.get(0));
		System.out.println("get 1 " + nombreArrayList.get(1));
		System.out.println("get 2 " + nombreArrayList.get(2));

		// borramos todos los elemento de la lista
		nombreArrayList.clear();
		System.out.println("size : " + nombreArrayList.size());

		System.out.println("esta  vacio oel arrayList ?" + nombreArrayList.isEmpty());

		System.out.println("********************************************************");
		// declaramos un nuevo array List
		ArrayList<String> lista = new ArrayList<String>();

		// agregamos 10 elementos al ArrayList
		for (int i = 1; i <= 10; i++) {
			lista.add("Elemento " + i);
		}
		// declaramos el Iterador e imprimimos todos los elementos del arrayList
		Iterator<String> miIterator = lista.iterator();
		// iteradores :metodos ->>>> hasNext() :para comprobar que sigan quedando
		// elementos en el iterador
		// -> next() : nos da el siguiente elemento del iterador
		// -> remove() : elimina un elemento del iterador

		while(miIterator.hasNext()) {
			String elementoAuxiliar = miIterator.next();
			System.out.print(elementoAuxiliar + " - ");
		}
	

//		lista.add(2,"Elemento problema");
//		
//		System.out.println(lista.get(0));
//		System.out.println(lista.get(1));
//		System.out.println(lista.get(2));
//		System.out.println(lista.get(3));
//		System.out.println(lista.get(4));
//		System.out.println(lista.get(5));
//		System.out.println(lista.get(6));
//		System.out.println(lista.get(7));
//		System.out.println(lista.get(8));
//		System.out.println(lista.get(9));
//		System.out.println(lista.get(10));

//		System.out.println(lista.get(0));
//		System.out.println(lista.get(0));
//		System.out.println(lista.get(300_000));
//		
//		

	}

}
