package Threads;

public class ejemplo2 {
	// los hilos se ejecutan uno primero luego el otro
	//esto para evitar que los procesos se atiendan de igual
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hilosVarios hilo1= new hilosVarios();
		
		/*try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		hilosVarios2 hilo2= new hilosVarios2(hilo1);
		hilo2.start();
		
		hilo1.start();
		/*try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

}
/*****otra manera de crear varios hilos*********/
class hilosVarios extends Thread{
	
	public void run(){
		
		for(int i=0;i<15;i++){
			System.out.println("Ejecutando hilo: "+getName());
			try {
				sleep(800);
				//metodo JOIN espera a que el hilo muera
				//esto evita saturarno de hilos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class hilosVarios2 extends Thread{
	
	private Thread hilo;
	
	public hilosVarios2(Thread hilo){
		this.hilo=hilo;
	}
	public void run(){
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i=0;i<15;i++){
			System.out.println("Ejecutando hilo: "+getName());
			try {
				sleep(800);
				//metodo JOIN espera a que el hilo muera
				//esto evita saturarno de hilos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
