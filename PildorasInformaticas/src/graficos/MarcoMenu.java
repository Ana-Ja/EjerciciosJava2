package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MarcoMenu {
	public static void main(String[] args) {
		MenuFrame mimarco = new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class MenuFrame extends JFrame{
	public MenuFrame() {
		setBounds(500,300,500,350);
		
		MenuLamina milamina = new MenuLamina();
		add(milamina);
		setVisible(true);
	}
}
class MenuLamina extends JPanel{
	public MenuLamina(){
		JMenuBar mibarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		//creamos items
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarcomo = new JMenuItem("Guardar como");
		//JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("bin/graficos/cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("bin/graficos/copiar.gif"));
		//si quiero que la imagen aparezca a la derecha, lo que hacemos es poner
		//el texto a la izquierda con el metodo setHorizontalTextPosition y una //
		//contante  entera 
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("bin/graficos/pegar.gif"));
		JMenuItem generales = new JMenuItem("Generales");
		
		//creo el submenu con sus items
		JMenu opciones = new JMenu("Opciones");
		JMenuItem opcion1 = new JMenu("Opcion 1");
		JMenuItem opcion2 = new JMenu("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		
		archivo.add(guardar);
		archivo.add(guardarcomo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		herramientas.add(generales);
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		add(mibarra);//agrego el menu a la lamina
		
		
	}
}