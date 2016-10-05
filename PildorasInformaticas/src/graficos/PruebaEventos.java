package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Video66
public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setVisible(true);
		setBounds(700,300,500,300);
		setTitle("Botones y eventos");
		//creamos un objeto lamina y se la a�adimos al marco
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}
class LaminaBotones extends JPanel implements ActionListener{
	JButton botonAzul = new JButton("azul");
	JButton botonAmarillo = new JButton("amarillo");

	JButton botonVerde = new JButton("verde");

	//construimos la lamina y le a�adimos el boton
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonVerde);
		//la lamina es el oyente y por tanto debe implementar 
       // interfaz ActionListener
		//el objeto evento es Action==al hacer click
		//objeto fuente es el boton azul, el que desencadena el evento
		//objeto oyente el que recibe el evento= this
		
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonVerde.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//es el metodo que hay que sobreescribir del interfaz ActionListener
		//actionEvent es el evento de raton. El de ventana es WindowEvent
		setBackground(Color.blue);
		//asi recibimos quien es el objeto fuente origen del evento
		//en el caso de tres bitines
		Object botonPulsado =e.getSource();
		if (botonPulsado== botonAzul) {
			setBackground(Color.blue);
		} else if (botonPulsado== botonAmarillo) {
			setBackground(Color.yellow);
		} else {
			setBackground(Color.green);
		}
	}
}