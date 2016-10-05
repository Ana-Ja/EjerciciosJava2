import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

//Video 54 CLASE INTERNA
public class Video54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relojbis mireloj = new Relojbis();
		mireloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulse Aceptar para terminar");
	    System.exit(0);			
	}

}
class Relojbis {
	
//	public Reloj(int intervalo, boolean sonido){
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//	}
//	private int intervalo;
//	private boolean sonido;
	public void enMarcha(int intervalo, final boolean sonido) {
		//CLASE INTERNA LOCAL
		//Su ambito es solo el metodo enMarcha, desde la clase externa no se puede
		//acceder a ella. Se puede hacer pq a esta clase solo se le va a llamar una vez
		//Ademas puede acceder a las variables de la clase externa y a variable del metodo donsde
		//se encuentra(en cuyo caso tienen que ser tb final)
		//Por ello, los atributos de la clase externa, pasaran a ser paramentros de
		//la funcio enMarcha, y como sonido se accede desde la clase interna, pasa 
		//a ser final. Y como consecuencia, ya no necesitamos el costructor ded Relo
		//pq los atributos han pasado a ser argumentos de enMarcha
		class DameLaHora implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date ahora= new Date();
				System.out.println("Te pongo la hora cada 3 seg." + ahora);
				//sonido esta definido fuera del ambito de la clase interna
				//pq una clase interna puede acceder a los campos private y nos
				//evitamos tener que dclarar los getter y setter
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		ActionListener oyente = new DameLaHora();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
}