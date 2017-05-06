package Colecciones;

import java.util.*;

public class set {
	
	/*************************************/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clientes cl1= new clientes("Antonio","45678945","1500");
		clientes cl2= new clientes("Rafael","000002","4546546");
		clientes cl3 = new clientes("Pedro","123045","456897");
		clientes cl4= new clientes("Julio","1231321","456787");
		clientes cl5= new clientes("Julio","1231321","456787");
		/*************************************************/
		Set <clientes> lista= new HashSet<clientes>();
		lista.add(cl1);
		lista.add(cl2);
		lista.add(cl3);
		lista.add(cl4);
		lista.add(cl5);
		
		for(clientes e:lista){
			System.out.println(e.getNombre()+" "+e.getN_cuenta()+" "+e.getSaldo());
		}
		
		
		
		
	}

}
/*******clase para tratar un set de clientes******/
