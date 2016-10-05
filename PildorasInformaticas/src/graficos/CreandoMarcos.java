package graficos;
import java.awt.Frame;

import javax.swing.*;
public class CreandoMarcos {
//video 55
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1 = new miMarco();
		//por defecto no son visibles
		marco1.setVisible(true);
		//que hace nuestro marco cuando se cierre
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class miMarco extends JFrame {
	public miMarco(){
		//tamaño de la ventana pq por defecto tienen 0
		//dependiendo del monitor quedara diferente la ventana
		//existe la clase toolkit que nos permite de manera compleja acceder
		//a la resolucion de muestro monitor y poner un tamaño u otro
		setSize(500,300);
		//se podian definir tambien aqui y no en el main
		//marco1.setVisible(true);
		//marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable(false);  //no se puede hacer grande
		setBounds(500,300,550,250);
		//maximixo en alto y largo
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi veentana");
	}
}
