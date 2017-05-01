package DisposicionesAvanzadas;
import java.awt.*;
import javax.swing.*;


public class pruebaDispo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoDispo marco= new marcoDispo();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}
class marcoDispo extends JFrame{
	public marcoDispo(){
		setTitle("Holaaaaa");
		setBounds(450,350,600,300);
		
		JLabel nombre = new JLabel("Nombre:");
		JTextField texto1= new JTextField(10);
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajah1=Box.createHorizontalBox();//crear contenedor horizontal
		cajah1.add(nombre);
		cajah1.add(Box.createHorizontalStrut(10));
		cajah1.add(texto1);
		
		
		//------------
		JLabel password = new JLabel("Password:");
		JTextField texto2= new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajah2=Box.createHorizontalBox();//crear contenedor horizontal
		cajah2.add(password);
		cajah2.add(Box.createHorizontalStrut(10));
		cajah2.add(texto2);
		
		//----
		JButton boton1=new JButton("OK");
		JButton boton2=new JButton("Cancelar");
		
		Box cajah3=Box.createHorizontalBox();
		cajah3.add(boton1);
		cajah3.add(Box.createGlue());
		cajah3.add(boton2);
		
		//-------
		Box cajaVertical = Box.createVerticalBox();
		cajaVertical.add(cajah1);
		cajaVertical.add(cajah2);
		cajaVertical.add(cajah3);
		
		add(cajaVertical);
	}
	
}
