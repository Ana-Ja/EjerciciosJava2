package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejemplo_Radio {

	public static void main(String[] args) {
		Marco_Radio mimarco = new Marco_Radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Marco_Radio extends JFrame{
	public Marco_Radio() {
		setBounds(500,300,500,350);
		
		Lamina_Radio milamina = new Lamina_Radio();
		add(milamina);
		setVisible(true);
	}
}
class Lamina_Radio extends JPanel{
	public Lamina_Radio(){
		setLayout(new BorderLayout());
		texto = new JLabel("En un ligar de la Mancha..");
		add(texto, BorderLayout.CENTER);
		lamina_botones = new JPanel();
		migrupo= new ButtonGroup();
		
		texto.setFont(new Font("Serif", Font.PLAIN,12));
		colocarBotones("Pequeño", false, 12);
		colocarBotones("Mediano", true, 14);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 24);
		add(lamina_botones, BorderLayout.SOUTH);
//		ButtonGroup migrupo = new ButtonGroup();
//		boton1 = new JRadioButton("Pequeño", false);
//		boton1.addActionListener(new Evento_radio());
//		boton2 = new JRadioButton("Mediano", true);
//		boton2.addActionListener(new Evento_radio());
//		boton3 = new JRadioButton("Granbde", false);
//		boton3.addActionListener(new Evento_radio());
//		boton4 = new JRadioButton("Muy Grande", false);
//		boton4.addActionListener(new Evento_radio());
//		JPanel lamina_radio = new JPanel();
//		migrupo.add(boton1);
//		migrupo.add(boton2);
//		migrupo.add(boton3);
//		migrupo.add(boton4);
//		lamina_radio.add(boton1);
//		lamina_radio.add(boton2);
//		lamina_radio.add(boton3);
//		lamina_radio.add(boton4);
//		add(lamina_radio, BorderLayout.SOUTH);
		
	}
//	private class Evento_radio implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			if (e.getSource()==boton1){
//				texto.setFont(new Font("serif", Font.PLAIN,10));
//			}else if (e.getSource()==boton2){
//				texto.setFont(new Font("serif", Font.PLAIN,12));
//			}else if (e.getSource()==boton3){
//				texto.setFont(new Font("serif", Font.PLAIN,18));
//			}else if (e.getSource()==boton4){
//				texto.setFont(new Font("serif", Font.PLAIN,24));
//			}	
//		}
//		
//	}
	public void colocarBotones(String  nombre, boolean seleccionado, final int tamano){
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		migrupo.add(boton);
		lamina_botones.add(boton);
		//podemos crear directamente el actionListener si hacer una clase oyente
		ActionListener mievento = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//al instancias una clase o interfaz dentro de un metodo nos exige que
				//el parametro tamano que se esta usando dentro de la interfaz interna elvento 
				//sea Final o constante para que no se puede modificar su valor desde fuera pq
				//se podria modificar su valor desde la ejecucion
				texto.setFont(new Font("Serif",Font.PLAIN, tamano));;
			}
			
		};
		boton.addActionListener(mievento);
		
	}
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	private ButtonGroup migrupo;
	private JPanel lamina_botones;
}