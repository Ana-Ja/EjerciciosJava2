package graficos;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuraci�n de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
		
		//accion para salir
		//instancio directamente pq Abstractaction tiene un constructor son esos argumentos
		Action accionSalir= new AbstractAction("Salir", new ImageIcon("src/graficos/salir.gif") ){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		};
		JMenu menu = new JMenu("Color");
		//anado al menu acciones en vez de items
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		//barra de menu
		JMenuBar barra_menu = new JMenuBar();
		barra_menu.add(menu);
		//agregamos la barra al marco
		setJMenuBar(barra_menu);
		
		//construccion de la barra de herramientas
		
		JToolBar barra = new JToolBar();
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		barra.add(accionRojo);
		barra.addSeparator();
		barra.add(accionSalir);
		//ubicacion de barra de herramientas por defecto arriba y sin moverse
		//para que se pueda arrastrar hay que ponerla dentro de un BorderLayout
		//y asi si que podremos moverla a otros sitios
		add(barra, BorderLayout.NORTH);
		
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



