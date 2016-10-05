package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Video 74-75
public class FocoEvento {

	public static void main(String[] args) {
		MarcoFoto mimarco = new MarcoFoto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoFoto extends JFrame{
	
	public MarcoFoto() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Eventos Teclado");
		add(new LaminaFoco());
		
	}
		
}
class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//pintamos los cuadros de texto
		//inhabilitamos el layout que Java le da a los componentes por deecto
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		//tenemos que darles pposicion y dimension al desactivar el layout
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		add(cuadro1);
		add(cuadro2);
		LanzaFoco elFoco = new LanzaFoco();
		
		cuadro1.addFocusListener(elFoco);
	}
	//clase oyente interna para que podamos acceder desde la 
	//la clase LanzaFoco a los cuadros de texto
	private class LanzaFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Gana el foco");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String email= cuadro1.getText();
			boolean comprobacion = false;
			for (int i=0; i<email.length();i++) {
				if (email.charAt(i) == '@'){
					comprobacion = true;
				}
			}
			if (comprobacion){
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
		
	}
	//las declaro aqui para que sean variables de clase
	//y tengan mayor ambito dentro de la clase
	JTextField cuadro1 ;
	JTextField cuadro2;
}
