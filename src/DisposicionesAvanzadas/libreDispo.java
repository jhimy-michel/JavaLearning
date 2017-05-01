package DisposicionesAvanzadas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;
public class libreDispo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoLibre marco= new marcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}
class marcoLibre extends JFrame{
	public marcoLibre(){
		setBounds(450,350,600,400);
		
		laminaLibre lamina=new laminaLibre();
		add(lamina);
	}
	
}
class laminaLibre extends JPanel{
	public laminaLibre(){
		setLayout(new enColumnas());//libreeee
		JButton boton1= new JButton("Libre soy!");
		JButton boton2= new JButton("Libre soy!");
		
		JButton boton3= new JButton("Libre soy!");
		JButton boton4= new JButton("Libre soy!");
		
		//boton1.setBounds(50,50,150,50);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		
		
	}
}
class enColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container cont) {
		// TODO Auto-generated method stub
		int contador=0;
		int n=cont.getComponentCount();
		for(int i=0;i<n;i++){
			contador++;
			Component c=cont.getComponent(i);
			c.setBounds(x, y, 100, 20);
			x+=100;
			if(contador%2==0){x=20;y+=20;}
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
	private int x=20;
	private int y=20;
	
}
