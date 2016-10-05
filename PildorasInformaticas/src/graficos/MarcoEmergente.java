package graficos;



import java.awt.BorderLayout;

import javax.swing.*;

public class MarcoEmergente {

	public static void main(String[] args) {
		MarcoEmergenteM mimarco = new MarcoEmergenteM();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoEmergenteM extends JFrame{
	public MarcoEmergenteM() {
		setBounds(500,300,500,350);
		
		LaminaEmergenteM milamina = new LaminaEmergenteM();
		add(milamina);
		setVisible(true);
	}
}
class LaminaEmergenteM extends JPanel{
	public LaminaEmergenteM(){
		setLayout(new BorderLayout());
		JPanel laminamenu= new JPanel();
		JMenuBar mibarra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu tamano = new JMenu("Tamaño");
		JMenu estilo = new JMenu("Estilo");
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);
		
		JTextPane miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		//agregamos lo elementos del menu
		JMenuItem  opcion1= new JMenuItem("Opcion1");
		emergente.add(opcion1);
		JMenuItem  opcion2= new JMenuItem("Opcion2");
		emergente.add(opcion2);
		
		//ahora hay que especificar sobre que elemento se hace el boton derecho
		//y como es sobre la almina, se pone directamente setcompo....
		setComponentPopupMenu(emergente); //este se vera en el trozo de lamina que hay arriba
		//este menu se vera en el area de texto
		miarea.setComponentPopupMenu(emergente);
	}
}