package DisposicionesAvanzadas;
import javax.swing.*;
import java.util.*;


public class marcoMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoMue muelle= new marcoMue();
		muelle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		muelle.setVisible(true);
	}

}
class marcoMue extends JFrame{
	public marcoMue(){
		setBounds(350,350,600,300);
		
		laminaMuelle lamina= new laminaMuelle();
		add(lamina);	
	}
	
}
class laminaMuelle extends JPanel{
	public laminaMuelle(){
		JButton boton1= new JButton("Boton 1");
		JButton boton2= new JButton("Boton 2");
		JButton boton3= new JButton("Boton 3");
		//--------------
		SpringLayout dispo= new SpringLayout();
		setLayout(dispo);
		//-----
		add(boton1);
		add(boton2);
		add(boton3);
		
		//-----------------------
		Spring mi_muelle =Spring.constant(0,50,100);
		Spring muelleRigid=Spring.constant(10);
		
		dispo.putConstraint(SpringLayout.WEST, boton1, mi_muelle, SpringLayout.WEST, this);
		
		dispo.putConstraint(SpringLayout.WEST, boton2,mi_muelle, SpringLayout.EAST, boton1);
		
		dispo.putConstraint(SpringLayout.WEST, boton3, mi_muelle, SpringLayout.EAST, boton2);
		
		dispo.putConstraint(SpringLayout.EAST, this, mi_muelle, SpringLayout.EAST, boton3);
		
	}
	
}
