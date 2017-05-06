package Colecciones;

class clientes{
	public clientes(String nombre,String n_cuenta,String saldo){
		this.nombre=nombre;
		this.saldo=saldo;
		this.n_cuenta=n_cuenta;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	/***********/
	

	private String nombre;
	private String n_cuenta;
	private String saldo;
	
}

