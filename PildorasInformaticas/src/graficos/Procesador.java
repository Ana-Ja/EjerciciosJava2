package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Procesador {

	public static void main(String[] args) {
		MarcoProcesador mimarco = new MarcoProcesador();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoProcesador extends JFrame{
	public MarcoProcesador() {
		setBounds(500,300,500,350);
		
		LaminaProcesador milamina = new LaminaProcesador();
		add(milamina);
		setVisible(true);
	}
}
class LaminaProcesador extends JPanel{
	public LaminaProcesador(){
		setLayout(new BorderLayout());
		JPanel laminamenu= new JPanel();
		fuente = new JMenu("Fuente");
		 tamano = new JMenu("Tama�o");
    	 estilo = new JMenu("Estilo");
		//estos elementos cambiar la letra
		configura_menu("arial", "fuente","Arial",0,0);
		configura_menu("courier", "fuente","Courier",0,0);
		configura_menu("verdana", "fuente","Verdana",0,0);
		//este cambia el estilo
		configura_menu("Negrita", "estilo","",Font.BOLD,1);
		configura_menu("Cursiva", "estilo","",Font.ITALIC,1);
		//este configura el tamano. Ponemos 9 pq no equivale a ningun estilo
		configura_menu("12", "tamano","",9,12);
		configura_menu("16", "tamano","",9,16);
		configura_menu("20", "tamano","",9,20);
		configura_menu("24", "tamano","",9,24);
	//	CrearMenu();
//		//**********************************************
		mibarra = new JMenuBar();
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		add(mibarra);//agrego el menu a la lamina
		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
	}
	private JMenuBar mibarra;
	private JTextPane miarea ;
	JMenu fuente, estilo, tamano;
	Font letras;
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tamanoo){
		JMenuItem elem_menu = new JMenuItem(rotulo);
	    if (menu=="fuente") {
	    	fuente.add(elem_menu);
	    }else if (menu=="estilo") {
	    	estilo.add(elem_menu);
	    }else if (menu=="tamano") {
	    	tamano.add(elem_menu);
	    }
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos,tamanoo));
	}
	private class Gestiona_Eventos implements ActionListener{
		String tipo_texto, menu;
		int estilo_letra, tamano_letra;
		//necesito pasar estos valores de la clase al oyente y lo 
		//hare por el constructor
		Gestiona_Eventos(String elemento,String texto2,int estilo2, int tamano2){
			tipo_texto=texto2;
			estilo_letra = estilo2;
			tamano_letra= tamano2;
			menu = elemento;
			}
		@Override
		public void actionPerformed(ActionEvent e) {
			//almaceno la fuente que tiene la fuente antes de cambiarla
			//para dejar lo que no cambiamos como estaba
			letras= miarea.getFont();
			//segun el menu donde haya pulsado, haremosuna cosa u otro
			if (menu=="arial" || menu=="courier" || menu=="verdana") {
				estilo_letra = letras.getStyle();
				tamano_letra = letras.getSize();
				
			}else if (menu=="Cursiva" || menu=="Negrita" ) {
				//si ya habia cursiva o negrita y vuelve a seleccioanr otro estilo
				if (letras.getStyle()==1 || letras.getStyle()==2){
					estilo_letra=3; //es la suma de las dos
				}
				tipo_texto = letras.getFontName();
				tamano_letra = letras.getSize();
				
			} else if (menu=="12" || menu=="16" || menu=="20" || menu=="24") {
				estilo_letra = letras.getStyle();
				tipo_texto = letras.getFontName();
				
			}
			miarea.setFont(new Font(tipo_texto,estilo_letra, tamano_letra));
			
		
		
	}
	}
}
//	private void CrearMenu() {
//		 mibarra = new JMenuBar();
//		 fuente = new JMenu("Fuente");
//		 tamano = new JMenu("Tama�o");
//		 estilo = new JMenu("Estilo");
//		//**********************************************
//		JMenuItem arial = new JMenuItem("Arial");
//		JMenuItem Courier = new JMenuItem("Courier");
//		//se puede hacer con clase interna Gestiona_menus()
//		//Courier.addActionListener(new Gestiona_menus());
//		//y tb con clase interna anonima
//		Courier.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				miarea.setFont(new Font("Courier", Font.PLAIN, 12));
//				
//			}
//			
//		});
//		JMenuItem verdana = new JMenuItem("Verdana");
//		
//
//		fuente.add(arial);
//		fuente.add(Courier);
//		fuente.add(verdana);
//		//**********************************************
//		JMenuItem negrita = new JMenuItem("Negrita");
//		JMenuItem cursiva = new JMenuItem("Cursiva");
//
//		estilo.add(negrita);
//		estilo.add(cursiva);
//		//**********************************************
//		JMenuItem diez= new JMenuItem("10");
//		JMenuItem doce = new JMenuItem("12");
//		JMenuItem catorce= new JMenuItem("14");
//		JMenuItem dieciseis = new JMenuItem("16");
//		
//		tamano.add(diez);
//		tamano.add(doce);
//		tamano.add(catorce);
//		tamano.add(dieciseis);
//		//**********************************************
//		mibarra.add(fuente);
//		mibarra.add(estilo);
//		mibarra.add(tamano);
//		add(mibarra);//agrego el menu a la lamina
//		
//	}
//	//creamos clase interna para gestionar los evento de comic
//	private class Gestiona_menus implements ActionListener{
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO mi-generated method stub
//			miarea.setFont(new Font("Courier", Font.PLAIN, 12));
//		}
//		
//	}
//}
