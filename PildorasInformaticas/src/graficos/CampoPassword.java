package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CampoPassword{

	public static void main(String[] args) {
		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoPassword extends JFrame{
	public MarcoPassword() {
		setBounds(500,300,500,350);
		
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
		setVisible(true);
	}
}
class LaminaPassword extends JPanel{
	public LaminaPassword(){
		//lamina principal Border
		setLayout(new BorderLayout());
		//2 lamina GridLayout en el Norte
		JPanel lamina_superior = new JPanel();
		lamina_superior.setLayout(new GridLayout(2,2));
		add(lamina_superior, BorderLayout.NORTH);
		
		//componenetes de la lamina sueprior
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Contraseņa");
		JTextField c_usuario = new JTextField(15);
	    c_password = new JPasswordField(15);
	    //ponemos a la escucha el password
	    Document docu = c_password.getDocument();
	    docu.addDocumentListener(new Comprueba_pass());
	    
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_password);
		
		//boton en la lamina principal en el sur
		JButton enviar = new JButton("Enviar");
		add(enviar, BorderLayout.SOUTH);
	}
	
	//gestiona evento de password
	private class Comprueba_pass implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			 PonColor(); 
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			 PonColor() ;
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private void  PonColor() {
		char [] contrasena;
		//getpassword devuelve un arrya tipo char
		contrasena= c_password.getPassword();
		if (contrasena.length<8 || contrasena.length>12) {
			c_password.setBackground(Color.RED);
		}else{
			c_password.setBackground(Color.WHITE);
		}
	}
	JPasswordField c_password ;
}
