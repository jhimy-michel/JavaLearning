package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class pruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> paises= new LinkedList<String>();
		paises.add("Espanha");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		/**************/
		LinkedList<String> capitales= new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("Mexico city");
		capitales.add("Lima");
		//--------------------
		ListIterator<String> it_paises= paises.listIterator();
		ListIterator<String> it_capitales= capitales.listIterator();
		
		while(it_capitales.hasNext()){
			if(it_paises.hasNext()){
				it_paises.next();
			}
			it_paises.add(it_capitales.next());
		}
		System.out.println(paises);
		it_capitales=capitales.listIterator();
		while(it_capitales.hasNext()){
			it_capitales.next();
			if(it_capitales.hasNext()){
				it_capitales.next();
				it_capitales.remove();
			}
		}
		System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
		
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
	}

}
