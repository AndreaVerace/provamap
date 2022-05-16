package it.prova.provamap.test;

import java.util.HashMap;

/*
 * Il metodo put() consente l'inserimento di un valore mentre get() ne permette il recupero,
	specificando una chiave. containsKey() e clear() permettono rispettivamente di verificare
	 la presenza di un elemento
	con una determinata chiave e di cancellare tutti gli elementi della mappa.
	 Con keySet() possiamo ottenere l'insieme delle sole chiavi,
	mentre con values() i soli valori presenti nella mappa.
 */



public class TestMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "NAPOLI");
		hm.put(2, "MILAN");
		hm.put(3, "JUVENTUS");
		hm.put(4, "INTER");
		
		for(Integer prova : hm.keySet()) {
			System.out.println(hm.get(prova));
		}
		
		System.out.println("----------------");
		System.out.println(hm.containsKey(1));
		
		System.out.println("----------------");
		System.out.println(hm.values());
		

	}

}
