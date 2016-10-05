package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto mimarco = new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto(){
		setTitle("Pruebas texto");
		
		setBounds(700,300,500,300);
		setVisible(true);
		LaminaTexto lamina = new LaminaTexto();
		
		add(lamina);
		

		
	}
}
class LaminaTexto extends JPanel {
	public LaminaTexto(){
		//creo layoir Border y en el norte introduzco otra lamina Flow 
		//con el textfield. En el centro saco el resultado de la comprobacion
		BorderLayout milayout = new BorderLayout();
		setLayout(milayout);
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("", JLabel.CENTER);
				
	    JLabel eti1 = new JLabel("Mail:");
	    lamina2.add(eti1);
		campo1 = new JTextField(30);
		lamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		JButton boton = new JButton("Comprobar");
		
		DameTexto mievento = new DameTexto();
		boton.addActionListener(mievento);
		lamina2.add(boton);
		add(lamina2, BorderLayout.NORTH);
	}
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int correcto=0;
			String email=campo1.getText().trim();
			for (int i=0;i< email.length();i++){
				if (email.charAt(i)=='@'){
					correcto++;
				}
			}
			if (correcto!=1){
				System.out.println("Texto incorrecto");
			}else {
				System.out.println("Incorrecto");
			}
			System.out.println(campo1.getText());
			//comprobaciones de email encontradas por intenet
			
			// Establecer el patron
		    Pattern p = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");
		    //Otros pattern
		   // "^[\\w\\-\\_]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$"		    
	        //"^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$"
		    //"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$"

		    // Asociar el string al patron
		    Matcher m = p.matcher(email);

		   // Comprobar si encaja devuelve true o false
		    System.out.println( "Encaja ?" + m.matches());
		    if (m.matches()){
		    	resultado.setText("Correcto");
		    }else {
		    	resultado.setText("Incorrecto");
		    }
		}
		
	}
	private JTextField campo1 ;
	private JLabel resultado;
}