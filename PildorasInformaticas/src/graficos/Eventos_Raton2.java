package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
//Video 73
public class Eventos_Raton2 {

	public static void main(String[] args) {
		MarcoRaton2 mimarco = new MarcoRaton2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Eventos Teclado");
		//debemos preparar al marco para esta preparado para recibir eventos
		EventosdeRaton2 nuevoEstado = new EventosdeRaton2();
		addMouseMotionListener( nuevoEstado);
	}
	
	
}
class EventosdeRaton2 implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}
	
}