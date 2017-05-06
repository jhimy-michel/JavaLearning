package Colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libro1= new Libros("P en Java","Juan",25);
		Libros libro2= new Libros("P en Java","Juan",25);
		//libro1=libro2;
		if(libro1.equals(libro2)){
			System.out.println("Son iguales");
			System.out.println(libro1.hashCode()+ "!=" +libro2.hashCode());
		}else{
			System.out.println("No son iguales");
			System.out.println(libro1.hashCode()+ "!=" +libro2.hashCode());
		}
	}

}
