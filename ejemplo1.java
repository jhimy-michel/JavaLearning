import java.util.*;
public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-- <> dentro va el tipo de dato que mantendra
		//-- no permite alamcenar tipo de datos primitivo
		//-- solo de tipo objeto
		ArrayList <Empleado> listaEmpleado=new ArrayList<Empleado>();
		/********Notamos que el array puede crecer hasta el infito
		 * pero para ahorrar o evitar eso se limita de la siguiente manera
		 * ********/
		listaEmpleado.ensureCapacity(10);
		//------------
		listaEmpleado.add(new Empleado("Ana",45,2500));
		listaEmpleado.add(new Empleado("Pepe",25,2600));
		listaEmpleado.add(new Empleado("Juan",35,1800));
		listaEmpleado.add(new Empleado("Ana",45,2500));
		listaEmpleado.add(new Empleado("Pepe",25,2600));
		listaEmpleado.add(new Empleado("Juan",35,1800));
		listaEmpleado.add(new Empleado("Ana",45,2500));
		listaEmpleado.add(new Empleado("Pepe",25,2600));
		listaEmpleado.add(new Empleado("Juan",35,1800));
		listaEmpleado.add(new Empleado("Ana",45,2500));
		listaEmpleado.add(new Empleado("Pepe",25,2600));
		listaEmpleado.add(new Empleado("Juan",35,1800));
		//---------esto lo limita en serio
		listaEmpleado.trimToSize(); //esto para ahorrar recursos
		//--------
		System.out.println(listaEmpleado.size());
		/*for(Empleado e: listaEmpleado){
			System.out.println(e.dameDatos());
		}*/
		/****otra manera de recorrer el array*****/
		Iterator <Empleado> mi_iterador = listaEmpleado.iterator();
		while(mi_iterador.hasNext()){
			System.out.println(mi_iterador.next().dameDatos());
			
			
		}
		
		
	}

}
class Empleado{
	public Empleado(String nombre, int edad, double salario){
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	public String dameDatos(){
		return "Nombre: "+nombre+" Edad: "+edad+" Salario: "+salario;
	}
	private String nombre;
	private int edad;
	private double salario;
}
