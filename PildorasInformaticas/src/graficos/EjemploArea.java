package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea mimarco = new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoArea extends JFrame{
	public MarcoArea() {
		setBounds(500,300,500,350);
		
		LaminaArea milamina = new LaminaArea();
		add(milamina);
		setVisible(true);
	}
}
class LaminaArea extends JPanel{
	public LaminaArea(){
	    miarea = new JTextArea(8,20);
		miarea.setLineWrap(true);//meta saltos lineas automaticos cuando llega al final de linea
		//insertamos una 2 lamina con comportamiento de scroll
		JScrollPane laminascroll = new JScrollPane(miarea);
		//no agregamos miarea sino la lamina que tiene dentro mi componenete
		add(laminascroll);
		JButton miboton = new JButton("dale");
		miboton.addActionListener(new GestionaArea());
		add(miboton);
	}
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
		
	}

	private JTextArea miarea ;
}