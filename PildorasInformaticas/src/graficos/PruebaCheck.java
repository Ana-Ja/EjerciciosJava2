package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaCheck {

	public static void main(String[] args) {
		MarcoCheck mimarco = new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoCheck extends JFrame{
	public MarcoCheck() {
		setBounds(500,300,500,350);
		setTitle("CheckBox");
		LaminaCheck milamina = new LaminaCheck();
		add(milamina);
		setVisible(true);
	}
}
class LaminaCheck extends JPanel{
	public LaminaCheck(){
		setLayout(new BorderLayout());
		//creo una fuente
		Font miletra = new Font("Serif",Font.PLAIN,24);
	    texto = new JLabel("En un lugar de La Mancha");
	    //le pongo la fuente al texto
		texto.setFont(miletra);
		JPanel laminatexto = new JPanel();
		laminatexto.add(texto);
		//agrego la lamina a la lamina principal
		add(laminatexto, BorderLayout.CENTER);
		check1= new JCheckBox("Negrita");
		check2= new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		//lamina donde van los checks al sur
		JPanel laminachecks = new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);
		add(laminachecks, BorderLayout.SOUTH);
		
	}
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tipo=0; //BOLD=1  ITALIC =2
			if (check1.isSelected()) tipo +=Font.BOLD;
			if (check2.isSelected()) tipo +=Font.ITALIC;
			texto.setFont(new Font("Serif", tipo,24));
			
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1;
	private JCheckBox check2;
}