package poo;
import java.lang.reflect.Array;
import java.util.Arrays;
/**Una clase final es una clase de la cual no 
 * se pueden heredar los comportamientos
 * y atributos**/
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Empleado{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		/*System.out.println("Introduzca su nombre: ");
		String nombre=read.nextLine();
		System.out.println("Sueldo:");
		double sueldo=read.nextDouble();
		System.out.println("Año, mes y dia:");
		int agno=read.nextInt();
		int mes=read.nextInt();
		int dia=read.nextInt();
		EmpleadoC empleado1=new EmpleadoC(nombre,sueldo,agno,mes,dia);
		
		System.out.println("Estos son los datos registrados:");
		System.out.println("Nombre: "+empleado1.dev_nombre());
		System.out.println("Sueldo:" +empleado1.dev_sueldo());
		System.out.println("Fecha de contrato: "+empleado1.dev_fecha());
		
		System.out.println("Porcentaje para subir el sueldo:");
		double porcentaje = read.nextDouble();
		empleado1.cambia_sueldo(porcentaje);
		System.out.println("Sueldo aumentado: "+empleado1.dev_sueldo());
		
		*/
		/**Otra manera de tener muchas instancias y ahorrar codigo**/
		EmpleadoC[] misEmpleados = new EmpleadoC[5];
		/**Clase jefatura**/
		
		Jefatura jefe_RRH=new Jefatura("Jhimy",120,1996,5,5);
		jefe_RRH.estableceIncentivo(2570);
		//String[] miarray= new String[3];
		misEmpleados[0]=new EmpleadoC("Paco Gomez",85000,1990,12,17);
		misEmpleados[1]=new EmpleadoC("Jhimy Michel",15000,1996,8,6);
		misEmpleados[2]=new EmpleadoC("Pedro Perez",45000,1896,5,23);
		/**Polimorfismo
		 * principio de sustitucion**/
		misEmpleados[3]=jefe_RRH;//polimorfismo
		misEmpleados[4]=new Jefatura("Maria",9500,1999,6,26);//polimorfismo
		/**Castear objetos**/
		Jefatura jefazo=(Jefatura) misEmpleados[4];
		jefazo.estableceIncentivo(55000);
		
		/**Imprimir**/
		for(int i=0;i<misEmpleados.length;i++){
			System.out.println("Nombre: "+misEmpleados[i].dev_nombre());
			System.out.println("Sueldo: "+misEmpleados[i].dev_sueldo());
			System.out.println("Fecha: "+misEmpleados[i].dev_fecha());
		}
		System.out.println("<***********************>");
		/**Subir el sueldo**/
		/*for(int i=0;i<misEmpleados.length;i++){
			misEmpleados[i].cambia_sueldo(5);
		}*/
		/**Bucles mejorado de aumento de sueldo**/
		System.out.println(jefazo.tomar_decisiones(" Dar mas dias de vacaciones a los empleados"));
		for(EmpleadoC e:misEmpleados){
			e.cambia_sueldo(5);
		}
		/***Desplegar informacion**/
		/*for(int i=0;i<misEmpleados.length;i++){
			System.out.println("Nombre: "+misEmpleados[i].dev_nombre());
			System.out.println("Sueldo: "+misEmpleados[i].dev_sueldo());
			System.out.println("Fecha: "+misEmpleados[i].dev_fecha());
		}*/
		/**Despliegue mejorado**/
		Arrays.sort(misEmpleados);
		for(EmpleadoC e:misEmpleados){
			System.out.println("Nombre: "+e.dev_nombre());
			System.out.println("Sueldo: "+e.dev_sueldo());
			System.out.println("Fecha: "+e.dev_fecha());
		}
		
	/*	EmpleadoC comercial=new Jefatura("Snadra",15200,2102,02,02);
		Comparable ejemplo=new EmpleadoC("pepe",1565,1203,03,03);
		//intaanceof
		if(comercial instanceof EmpleadoC){
			System.out.println("Es de tipo jefatura");
		
		}if(ejemplo instanceof Comparable){
			System.out.println("Implementa la interfaz comparable");
		}*/
		
		
		
		/***Interfaces creadas
		 * generalmente representan comportamientos
		 * unicos de una ****/
	
		
	}
	
}
class EmpleadoC implements Comparable {
	public EmpleadoC(String nom,double sue,int agno,int mes,int dia){
		nombre=nom;
		sueldo=sue;
		//GregorianCalendar-> te construye una fecha
		//le restamo el mes porque enero=0
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();//el metodo gettime() es heredado de la clase calendar
		
		
	}
	public int compareTo(Object mi_objeto){
		EmpleadoC otro=(EmpleadoC) mi_objeto;
		if(this.sueldo<otro.sueldo){
			return -1;
		}else if(this.sueldo>otro.sueldo){return 1;}
		return 0;
	}
	/**Sobreacarga de construtores**/
	/**Es utilizado para darles a tus instancias
	 * varios estados inicial
	 * el constructor debe variar en los parametros que recibe
	 * Ejemplo**/
	/**Podemos instanciar otro empleado
	 * y solo pasarle un parametro
	 * es decir si le pasas solo el nombre
	 * llamas al este constructor
	 * si le pasas los cinco
	 * se va al primer constructor
	 * java se basa en el numero de argumentos
	 * para decidir a que constructor se esta llamando**/
	public EmpleadoC(String nom){
		nombre = nom;
	}
	//el this llama al primer constructor
	/**
	public EmpleadoC(String nom){
		this(nom,300,200,01,01);
	}**/
	/**********/
	
	
	/**Getter**/
	public String dev_nombre(){
		return nombre;
	}
	public double dev_sueldo(){
		return sueldo;
	}
	public Date dev_fecha(){
		return altaContrato;
	}
	/**SETTER**/
	public void cambia_sueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
/****/
class Jefatura extends EmpleadoC implements Jefes{
	
	/**El constructor por defecto es de la clase padre**/
	public Jefatura(String nom,double sue,int agno,int mes,int dia){
		super(nom,sue,agno,mes,dia);//este constructor pide parametros
	}
	private double incentivo;
	/***metodo de la interfaz****/
	public String tomar_decisiones(String decisiones){
		return "Un miembro de la direccion ha tomado la decision de: "+decisiones;
	}
	/*******/
	public void estableceIncentivo(double b){//getter
		incentivo=b;
	}
	public double dame_Sueldo_incentivo()
	{
		//si los metodos se llaman iguales
		//utilizas super para decirle a eclipse
		//que es el metodo de la clase padre
		double sueldoJefe=dev_sueldo();
		return sueldoJefe+incentivo;
	}
	
	
}