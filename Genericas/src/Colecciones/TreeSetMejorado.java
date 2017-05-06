package Colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo primero= new Articulo(1,"Shampo");
		Articulo segundo= new Articulo(2,"Soda");
		Articulo tercero= new Articulo(3,"Galletas");
		
		
		TreeSet<Articulo> orden= new TreeSet<Articulo>();
		orden.add(segundo);
		orden.add(primero);
		orden.add(tercero);
		
		for(Articulo e:orden){
			System.out.println(e.getDescripcion());
		}
		System.out.println("----------Orden Alfabetico------------");
		comparadorArticulos compa = new comparadorArticulos();
		TreeSet<Articulo> ordena2=new TreeSet<Articulo>(compa);
		ordena2.add(primero);
		ordena2.add(segundo);
		ordena2.add(tercero);
		for(Articulo e:ordena2){
			System.out.println(e.getDescripcion());
		}
	}

}
class Articulo implements Comparable<Articulo>{
	public Articulo(int num,String desc){
		num_Articulo=num;
		descripcion=desc;
	}
	@Override
	public int compareTo(Articulo ar) {
		
		return num_Articulo-ar.num_Articulo;
	}
	public String getDescripcion(){
		return descripcion;
	}
	private int num_Articulo;
	private String descripcion;
	//-----------------------------
	
}
class comparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
	
}