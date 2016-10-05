package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//Video 71
public class EventosTeckado {

	public static void main(String[] args) {

		MarcoconTeclado mimarco = new MarcoconTeclado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoconTeclado extends JFrame{
	
	public MarcoconTeclado() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Eventos Teclado");
		//debemos preparar al marco para esta preparado para recibir eventos
		EventodeTeclado nuevoEstado = new EventodeTeclado();
		addKeyListener( nuevoEstado);
	}
	
	
}
class EventodeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char letra= e.getKeyChar();
		System.out.println("Tecla presionada" +letra);
		System.out.println("Codigo presionada" + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
