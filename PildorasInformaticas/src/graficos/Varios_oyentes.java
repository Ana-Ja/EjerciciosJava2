package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		Marco_Principal mimarco = new  Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class Marco_Principal extends JFrame{
	public Marco_Principal() {
		setTitle("Varios oyentes");
		setBounds(1300,100,300,200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
}
class Lamina_Principal extends JPanel{
	public Lamina_Principal(){
		//al pulsar la fuente boton nuevo se genera un objeto evento que es
		//recibido po una clase oyente que llama o crea una instancia
		//de Marco_emergente para crear una ventana y recurrimos a clase interna
		
		JButton boton_nuevo = new JButton("nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		//ek boton nuevo es una fuente de evento
		OyenteNuevo miOyente = new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
	}
	//creo una clase interna oyente
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
			
		}
		
	}
	//lo defino fuera pq lo voy a usar en otros metdos de la clase
	JButton boton_cerrar; 
}
class Marco_Emergente extends JFrame {
	//static pq la van a compartir todas las instancias y asi aumenta el contador
	private static int contador=0;
	//paso por parametro la fuente boton_cerrar
	public Marco_Emergente(JButton boton_de_principal){
		contador++;
		setTitle("Ventana"+ contador);
		setBounds(40*contador,40*contador,300,150);
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// tiene que cerrar el propio objetoy liberar recursos 
			//usamos metodo dispose() que lo hereda JFrame de Window
			dispose();	
		}
		
	}
}