package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
//Video 69
public class Eventos_Ventana2 {

	public static void main(String[] args) {
		MarcoVentana2 mimarco = new MarcoVentana2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana1");
		mimarco.setBounds(400,300,500,305);
		MarcoVentana2 miMarco2 = new MarcoVentana2();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco2.setTitle("VEntana2");
		miMarco2.setBounds(900, 300, 500, 300);

	}

}
class MarcoVentana2 extends JFrame{
	
	public MarcoVentana2() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Botones y eventos");
	
		addWindowListener(new M_Ventana2());
	}
	
	
}
class M_Ventana2 extends WindowAdapter {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana se esta cerrando");
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		//escribimos un mensaje en consola cuando minimizemos la ventana
		System.out.println("Ventana minimizada");
		
	}


}