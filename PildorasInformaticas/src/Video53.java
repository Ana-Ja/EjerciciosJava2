import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

//Video 53 CLASE INTERNA
public class Video53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj mireloj = new Reloj(3000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulse Aceptar para terminar");
	    System.exit(0);			
	}

}
class Reloj {
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	private int intervalo;
	private boolean sonido;
	//CLASE INTERNA
	private class DameLaHora implements ActionListener {

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
}