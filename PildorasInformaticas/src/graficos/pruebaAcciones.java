package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
//Videos 76-79
public class pruebaAcciones {

	public static void main(String[] args) {
		MarcoAcciones mimarco = new MarcoAcciones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoAcciones extends JFrame{
	
	public MarcoAcciones() {
		setBounds(700,300,500,300);
		setTitle("Botones y eventos");
		//creamos un objeto lamina y se la a�adimos al marco
		PanelAccion milamina = new PanelAccion();
		add(milamina);
	}
}
class PanelAccion extends JPanel{
//	JButton botonAzul = new JButton("azul");
//	JButton botonAmarillo = new JButton("amarillo");
//
//	JButton botonVerde = new JButton("verde");

	//construimos la lamina y le a�adimos el boton
	public PanelAccion() {
//		add(botonAzul);
//		add(botonAmarillo);
//		add(botonVerde);
		//***** 1 fuente de evento ******//
	//instanciamos la clase oyente para despues decir quien es la fuente del evento
	//y poner el objeto oyente a la escucha
		AccionColor accionAmarillo = new AccionColor("Amarillo",new ImageIcon("src/graficos/icono.gif"), Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul",new ImageIcon("src/graficos/icono.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo",new ImageIcon("src/graficos/icono.gif"), Color.RED);
		
		//existe un constructor de Jbuttin que recibe sus propiedades a traves de un objeto action
		//Cuando escribimos add(new JButton(accionAmarillo)) estamos instanciando la clase JButton invocando al constructor 
		//JButton (Action a) que pone el bot�n a la escucha de la acci�n de turno
		// La clase que determina la acci�n con su m�todo actionPerformed est� creada justo debajo 
		//de la instanciaci�n.
		add( new JButton(accionAmarillo));
		add( new JButton(accionAzul));
		add( new JButton(accionRojo));
		
		//***** 2� fuente de evento: la combinacon de teckas******//
		
		//creamos un mapa de entrada. getInputMao nos devuelve un intputmap
		//paso1.creamos un inputmap yle decimos que el componente que recibe la
		//combin esta dentro de a�la ventana qye recibe el foco
		InputMap mapaEntrada= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//paso2:cual va a ser la combin de teclas --> KeyStroke.getKeyStroke("ctrl A")
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo"); //el objeto "fondo_amarillo" se crea en este momento
		//paso3:asignar combinacion de teclas a objetos usando el metodo put  de la clase InputMap
		//`puedo asignar dos comb. de teclas a una misma accion
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl T"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		//paso 4: asignar el objeto creado anteriormente a la accion con el metodo put  de ActionMap
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
	}
	//ahora ponemos la lamina a la escucha creando una clase que o bien implemente la
	//interfaz Action o bien herede de AbstractAction
	private class AccionColor extends AbstractAction {
	//la clase abstractaction implementa 6 de los 7 metodos de la clase Action
		public AccionColor(String nombre, Icon icono, Color colorboton){
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+ nombre);
			putValue("color_de_fondo", colorboton);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//rescatamos los valores de una clave
			//hacemos casting pq nos desvuelve un string
			Color c=(Color)getValue("color_de_fondo");
			//como setbackgroiung es un metodo de Jpanel, lo que hacemos es meter la clase oyente AcconColor
			//en una clase interna de la lamina
			setBackground(c);
			System.out.println("nombre: "+ getValue(Action.NAME)+ " descripcion "+getValue( Action.SHORT_DESCRIPTION));
		}
		
	}
	
}
