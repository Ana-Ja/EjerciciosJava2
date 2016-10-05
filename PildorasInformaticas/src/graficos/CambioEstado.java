package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
//Video 70
public class CambioEstado {

	public static void main(String[] args) {
		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Cambio Estado");
		//debemos preparar al marco para esta preparado para recibir eventos
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
	}
	
	
}
class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stubsyso
		System.out.println("la ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("maximizada");
		} else if (e.getNewState()==Frame.ICONIFIED) {
			System.out.println("iconizada");
		}  else if (e.getNewState()==Frame.NORMAL) {
			System.out.println("normal");
		}	
	}
	
}