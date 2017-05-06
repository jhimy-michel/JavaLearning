package Threads;

public class BancoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco b= new Banco();
		for(int i=0;i<100;i++){
			EjecucionTransferencias r = new EjecucionTransferencias(b,i,2000);
			Thread t= new Thread(r);
			t.start();
		}
		
		
	}

}
class Banco{
	public Banco(){
		cuentas=new double[100];
		for(int i=0;i<cuentas.length;i++){
			cuentas[i]=2000;
		}
	}
	
	public void transferencia(int cuenta_origen, int cuenta_destino, double cantidad){
		if(cuentas[cuenta_origen]<cantidad){
			return;
		}
		
		System.out.println(Thread.currentThread());
		cuentas[cuenta_origen]-=cantidad;//dinero que sale de la cuenta origen
		System.out.printf("%10.2f de %d para %d",cantidad,cuenta_origen,cuenta_destino);
		
		cuentas[cuenta_destino]+=cantidad;//dinero que entra en la cuenta destino
		
		System.out.printf(" Saldo total: %10.2f%n "+getSaldoTotal());
		
		
	}
	
	
	public double getSaldoTotal(){
		double suma_cuentas=0;
		for(double a:cuentas){
			suma_cuentas+=a;
		}
		return suma_cuentas;
		
	}
	
	private final double[] cuentas;
	
}
class EjecucionTransferencias implements Runnable{
	
	public EjecucionTransferencias(Banco b, int des,double max){
	
		banco=b;
		deLaCuenta=des;
		cantidadMax=max;
	}
	
	public void run() {
		try {
			while(true){
				int paraLaCuenta=(int)(100*Math.random());
				double cantidad= cantidadMax*Math.random();
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				
					Thread.sleep((int) (Math.random()*30));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
}
