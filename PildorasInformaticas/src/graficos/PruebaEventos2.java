package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Video 67 En el ejercicio anterior el objeto fuente(boton) esta dentro del objeto listener(Lamina)
//Aqui vamos a hacer el mismo ejercicio pero el listener va a ser otro objeto diferente. Vamos a crear
//un objeto nuevo llamado 

public class PruebaEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones2 mimarco = new MarcoBotones2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Botones y eventos");
		//creamos un objeto lamina y se la a�adimos al marco
		LaminaBotones2 milamina = new LaminaBotones2();
		add(milamina);
	}
}
class LaminaBotones2 extends JPanel {
	JButton botonAzul = new JButton("azul");
	JButton botonAmarillo = new JButton("amarillo");

	JButton botonRojo = new JButton("rojo");

	//construimos la lamina y le a�adimos el boton
	public LaminaBotones2() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		ColorFondo Amarillo = new ColorFondo(Color.yellow);
		ColorFondo Azul = new ColorFondo(Color.blue);
		ColorFondo Rojo = new ColorFondo(Color.red);
		
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
	}
	//clase interna que puede tener acceso a los metodos de la clase que
	//la contiene, en nuesctro caso, podemos acceder al metodo
	//setbackgroun de la lamina. Ademas las encapsulamos poniendole
	//private para que codig que no pertenezca a esta clase lamina
	//pueda acceder a ella
	private class ColorFondo implements ActionListener {
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		private Color colorDeFondo;
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
			
		}
	}

}
