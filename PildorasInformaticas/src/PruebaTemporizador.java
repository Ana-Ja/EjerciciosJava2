import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

//HECHO EN EL VIDEO 52 DE PILDORASINFORMATICAS
public class PruebaTemporizador {

	public static void main(String[] args) {
		// este clase timer necesita el tiempo y un objeto oyente
		//del interfaz ActionListener por lo que nos crearemos una
		//clase que implemente ese interfaz pq los interfazes no
		//se pueden instanciar. 
		//Tb podria haber escrito: ActionListener oyente = new DameHora();
		
		DameHora oyente = new DameHora();
		Timer mitemporizador = new Timer(8000, oyente);
		mitemporizador.start();
		//cuando ejecute esta instruccion, si no hacemos nada, el programa 
		//finaliza por lo que no le da tiempo ni a pasar 5 seg.
		//por lo que vamos a visualizar un mensaje en pantalla para que
		//el programa no muera y podamos ver nuestro reloj
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0); //matamos el programa
	}

}
//creamos una clase que implemente el intefaz ActionListener
//y debemos desarrollar la accion a realizar cada 8seg. en su metodo
//ActionPeroformed
class DameHora implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();  //hora de ahora
		 System.out.println("Te pongo la hora cada " + ahora);
		//Vamos a emitir un pitido y usaremos la clase Toolkit que tiene
		 //metodos que permiten relaccionar los recursos del S.Ope con nuestro 
		 //codigo java(resolucion de pantala, sonido del sistema..)
		 Toolkit.getDefaultToolkit().beep();
	}
}