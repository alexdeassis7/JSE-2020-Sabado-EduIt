package com.educacionit.clase6set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		//	wrapper para que un Set pueda ser sincronizado 	
//		Set set = Collections.synchronizedSet(new HashSet());
//		
//		SortedSet sortedSet = (SortedSet) Collections.synchronizedSet(new TreeSet());
//		
//		Set linkedSet = Collections.synchronizedSet(new LinkedHashSet());
		
		/**			LINKEDHASH SET    */
		final Set linkedHashSet = new LinkedHashSet(1_000_000_000);
		final Long startlinkedHashSetTime = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000 ;i++ ) {
			linkedHashSet.add(i);
		}
		final Long endlinkedHashTime = System.currentTimeMillis();
		System.out.println("duracion total linkedHashSet : " + (endlinkedHashTime - startlinkedHashSetTime));

		/**			HASH SET    */
		final Set hashSet = new HashSet(1_000_000);
		//capturamos hora de inicio de carga desde el sistema
		final Long startHashSetTime = System.currentTimeMillis();
		//agregamos 1.000.000 de elemntos al hash set
		for(int i = 0; i < 1_000_000_000 ;i++ ) {
			hashSet.add(i);
		}
		//capturamos hora de fin de carga desde el sistema
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("duracion total HashSet : " + (endHashSetTime - startHashSetTime));

		

		/**			TREE SET    */
		final Set treeSet = new TreeSet();
		final Long starttreeSetTime = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000 ;i++ ) {
			treeSet.add(i);
		}
		final Long endtreeSetTime = System.currentTimeMillis();
		System.out.println("duracion total treeSet : " + (endtreeSetTime - starttreeSetTime));
	}

}




