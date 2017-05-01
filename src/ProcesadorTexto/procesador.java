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
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		//------------------
		configura_menu("Arial","Fuente","Arial",9,10);
		configura_menu("Coursier","Fuente","Courier",9,10);
		configura_menu("Verdana","Fuente","Verdana",9,10);
		
		//-----estos elementos no cambia la fuente
		configura_menu("Negrita","Estilo","",Font.BOLD,1);
		configura_menu("Cursiva","Estilo","",Font.ITALIC,1);
		//---------
		configura_menu("12","Tamano","",9,12);
		configura_menu("16","Tamano","",9,16);
		configura_menu("20","Tamano","",9,20);
		configura_menu("24","Tamano","",9,24);
		//---------
		mi_barra.add(fuente);
		mi_barra.add(estilo);
		mi_barra.add(tamano);
		
		
		/******/
		
		laminaMenu.add(mi_barra);
		add(laminaMenu,BorderLayout.NORTH);
		/*******/
		mi_area=new JTextPane();
		add(mi_area,BorderLayout.CENTER);
		
	}
	public void configura_menu(String rotulo,String menu,String tipo_letra,int estilos,int tam){
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		/*********/
		if(menu=="Fuente"){fuente.add(elem_menu);}
		else if(menu=="Estilo"){estilo.add(elem_menu);}
		else if(menu=="Tamano"){tamano.add(elem_menu);}
		
		elem_menu.addActionListener(new gestiona_eventos(rotulo,tipo_letra,estilos,tam));
	}
	private class gestiona_eventos implements ActionListener{
		//-----
		String tipo_texto, menu;
		int estiloLetra,tamanoLetra;
		//------
		gestiona_eventos(String elemento,String texto2,int estilo2,int tam_letra){
			tipo_texto=texto2;
			estiloLetra=estilo2;
			tamanoLetra=tam_letra;
			menu=elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			letras=mi_area.getFont();
			System.out.println("");
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana"){
				estiloLetra=letras.getStyle();
				tamanoLetra=letras.getSize();
			}
			else if(menu=="Cursiva" || menu=="Negrita"){
				if(letras.getStyle()==1 || letras.getStyle()==2){
					estiloLetra=3;
				}
				tipo_texto=letras.getFontName();
				tamanoLetra=letras.getSize();
			}
			else if(menu=="12" || menu=="16" || menu=="20" || menu=="24"){
				estiloLetra=letras.getStyle();
				tipo_texto=letras.getFontName();
			}
			mi_area.setFont(new Font(tipo_texto,estiloLetra,tamanoLetra));
			
		}
		
	}
	private JMenu fuente,estilo,tamano;
	private Font letras;
	private JTextPane mi_area ;
	/*********clase interna*********/
}
