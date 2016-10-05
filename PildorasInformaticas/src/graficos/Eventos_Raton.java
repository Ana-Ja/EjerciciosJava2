package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
//Video72
public class Eventos_Raton {

	public static void main(String[] args) {
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Eventos Teclado");
		//debemos preparar al marco para esta preparado para recibir eventos
		EventosdeRaton nuevoEstado = new EventosdeRaton();
		addMouseListener( nuevoEstado);
	}
	
	
}
//con clase adaptadora
class EventosdeRaton extends MouseAdapter{
//	public void mouseClicked(MouseEvent e){
//		System.out.println("Coordenada X: "+ e.getX() + " Coordenada y: " + e.getY());
//		System.out.println("clicl pulsados izdo  "+ e.getClickCount());
//		
//	}
	public void mousePressed(MouseEvent e){
		System.out.println(" que boton??" + e.getModifiersEx());
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("has pulsado izdo");
		} else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("has pulsado rueda");
		} else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has pulsado dha");
		}	
	}
}

//class EventosdeRaton implements MouseListener {
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Has hecho clic");
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stubs
//		System.out.println("Acabas de presionar");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de levantar");
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de entar");
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de salir");
//	}
//	
//}