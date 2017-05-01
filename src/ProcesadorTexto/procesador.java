package ProcesadorTexto;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;
public class procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuProcesador marco=new menuProcesador();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}
class menuProcesador extends JFrame{
	public menuProcesador(){
		setBounds(500,300,550,400);
		laminaProcesador lamina= new laminaProcesador();
		add(lamina);
		
	}
}
class laminaProcesador extends JPanel{
	public laminaProcesador(){
		setLayout(new BorderLayout());
		
		/*****segunda lamina*****/
		JPanel laminaMenu=new JPanel();
		/*****menu principal****/
		JMenuBar mi_barra=new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		
		mi_barra.add(fuente);
		mi_barra.add(estilo);
		mi_barra.add(tamano);
		
		/******Sub Elementos******/
		JMenuItem arial=new JMenuItem("Arial");
		arial.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mi_area.setFont(new Font("Arial",Font.PLAIN,12));
				
				
			}
		});
		
		//--------
		JMenuItem courier=new JMenuItem("Courier");
		//----------
		courier.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mi_area.setFont(new Font("Courier",Font.PLAIN,12));
				
				
			}
		});
		//--------
		JMenuItem verdana=new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mi_area.setFont(new Font("Verdana",Font.PLAIN,12));
				
				
			}
		});
		
		//----
		fuente.add(arial); fuente.add(courier); fuente.add(verdana);
		//-----------------
		JMenuItem negrita=new JMenuItem("Negrillas");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		
		estilo.add(negrita); estilo.add(cursiva);
		//--------
		
		JMenuItem arial12=new JMenuItem("12");
		JMenuItem arial16=new JMenuItem("16");
		JMenuItem arial20=new JMenuItem("20");
		JMenuItem arial24=new JMenuItem("24");
		
		tamano.add(arial12);tamano.add(arial16);
		tamano.add(arial20); tamano.add(arial24);
		
		/******/
		
		laminaMenu.add(mi_barra);
		add(laminaMenu,BorderLayout.NORTH);
		/*******/
		mi_area=new JTextPane();
		add(mi_area,BorderLayout.CENTER);
		
	}
	private JTextPane mi_area ;
	/*********clase interna*********/
}
