package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaJTextField {

	public static void main(String[] args) {
		MarcoPrueba mimarco = new MarcoPrueba();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoPrueba extends JFrame{
	public MarcoPrueba() {
		setBounds(500,300,500,350);
		
		LaminaPrueba milamina = new LaminaPrueba();
		add(milamina);
		setVisible(true);
	}
}
class LaminaPrueba extends JPanel{
	public LaminaPrueba(){
		JTextField elcampo = new JTextField(20);
		add(elcampo);
		//obtenemos elk objeto documento del JTextField para ponerlo a la escucha
		Document midoc = elcampo.getDocument() ;
		midoc.addDocumentListener(new EscuchaTexto());
		
	}
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado tecto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado tecto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
