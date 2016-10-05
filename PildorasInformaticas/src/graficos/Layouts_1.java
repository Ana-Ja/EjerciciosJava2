package graficos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_1 {

	public static void main(String[] args) {
		Marco_Layout marco = new Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco_Layout extends JFrame{
	public Marco_Layout(){
		setTitle("Prueba GridLayout");
		setBounds(600,350,600,300);
		Panel_Layout lamina = new Panel_Layout();
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		//lamina.setLayout(disposicion);
		//lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//lamina.setLayout(new FlowLayout(FlowLayout.RIGHT,75,100));		
		//add(lamina);
		
		//Para el ejemplo con dos laminas en el mismo marco, añadimos las dos laminas diciendolse
		//donde queremos que se posiciones en el marco, 
		add(lamina, BorderLayout.NORTH);
		Panel_Layout2 lamina2 = new Panel_Layout2();
		add(lamina2, BorderLayout.SOUTH);
		setVisible(true);
	}
}
class Panel_Layout extends JPanel {
	public Panel_Layout(){
		//lo mejor es que cuando se creae la lamina en el constructo
		//ya le digamos el layout que va a tener
		//setLayout(new FlowLayout(FlowLayout.RIGHT,75,100));
		
		
		//setLayout(new BorderLayout(10,10));		
		//es al boton donde se le dice donde se coloca
//		add(new JButton("Verde"),BorderLayout.NORTH);
//		add(new JButton("Amarillo"),BorderLayout.SOUTH);
//		add(new JButton("Azul"), BorderLayout.WEST);
//		add(new JButton("Rojo"),BorderLayout.CENTER);
//		add(new JButton("blanco"), BorderLayout.EAST);
		
		//ahora vamos a hacer dos laminas cons distintas disposiciones
		//dentro del mismo marco, una con FlowLayout y otra con BorderLayout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Verde"));
		add(new JButton("Amarillo"));
	}
}
class Panel_Layout2 extends JPanel{
	public Panel_Layout2(){
		setLayout(new BorderLayout(10,10));
		add(new JButton("Azul"), BorderLayout.WEST);
  		add(new JButton("Rojo"),BorderLayout.CENTER);
  		add(new JButton("blanco"), BorderLayout.EAST);
	}
}