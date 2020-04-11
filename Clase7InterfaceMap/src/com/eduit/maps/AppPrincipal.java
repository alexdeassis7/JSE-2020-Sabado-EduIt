package com.eduit.maps;

import java.awt.Container;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class AppPrincipal {

	public static void main(String[] args) {
//		Map<Key , Value>
		System.out.println("************HASH MAP********");
		Map<Integer ,String> map = new HashMap<Integer , String>();
		map.put(1 ,"Casillas");
		map.put(3 ,"Pique");
		map.put(11 ,"Capdevila");
		map.put(6,"Busquets");
		map.put(18 ,"Pedro");
		map.put(17,"Villa");		
		map.put(15,"Ramos");
		map.put(5,"Puyol");
		map.put(14 ,"Xabi Alonso");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer Key = (Integer) it.next();
			System.out.println("Clave: " + Key + "-> valor :" +map.get(Key));
		}
		
		
		System.out.println("************TREE MAP********");
		Map<Integer ,String> treemap = new TreeMap<Integer , String>();
		treemap.put(1 ,"Casillas");
		treemap.put(3 ,"Pique");
		treemap.put(11 ,"Capdevila");
		treemap.put(6,"Busquets");
		treemap.put(18 ,"Pedro");
		treemap.put(17,"Villa");		
		treemap.put(15,"Ramos");
		treemap.put(5,"Puyol");
		treemap.put(14 ,"Xabi Alonso");
		
		
		Iterator it2 = treemap.keySet().iterator();
		while(it2.hasNext()) {
			Integer Key = (Integer) it2.next();
			System.out.println("Clave: " + Key + "-> valor :" + treemap.get(Key));
		}
		
		System.out.println("************Linked Hash  MAP********");
		Map<Integer ,String> linkedHashmap = new LinkedHashMap<Integer , String>();
		linkedHashmap.put(1 ,"Casillas");
		linkedHashmap.put(3 ,"Pique");
		linkedHashmap.put(11 ,"Capdevila");
		linkedHashmap.put(6,"Busquets");
		linkedHashmap.put(18 ,"Pedro");
		linkedHashmap.put(17,"Villa");		
		linkedHashmap.put(15,"Ramos");
		linkedHashmap.put(5,"Puyol");
		linkedHashmap.put(14 ,"Xabi Alonso");
		
		
		Iterator it23 = linkedHashmap.keySet().iterator();
		while(it23.hasNext()) {
			Integer Key = (Integer) it23.next();
			System.out.println("Clave: " + Key + "-> valor :" + linkedHashmap.get(Key));
		}
		
		System.out.println("*********** Trabajando con los metodos del map **********");
		System.out.println("numero de elemento del treemap size()" + treemap.size());
		System.out.println("vemos si el map esta vacio " +treemap.isEmpty());
		System.out.println("obtenemos el elemento del map pasandole una clave get(11)" + treemap.get(11));
		System.out.println("borramos un elemento del Map remove(14)" + treemap.remove(14) );
		System.out.println("vemos que pasa si queremos obtener la clave 14 que ya no existe get(14)" + treemap.get(14));
		System.out.println("vemos si exxiste un elemento con la clave 18 containsKey(18)" + treemap.containsKey(18));
		System.out.println("vemos si exxiste un elemento con el value pedro, containsValue(Pedro)" + treemap.containsValue("Pedro"));
		System.out.println("Borramos todos los elementos del Map clear()") ; treemap.clear();
		System.out.println("numero de elemento del treemap size()" + treemap.size());
		System.out.println("vemos si el map esta vacio " +treemap.isEmpty());
		
		
		
		
		
		
		
		
	}

}
