package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaCombo {

	public static void main(String[] args) {
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoCombo extends JFrame{
	public MarcoCombo() {
		setBounds(500,300,500,350);
		
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
		setVisible(true);
	}
}
class LaminaCombo extends JPanel{
	public LaminaCombo(){
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de La Mancha...");
		texto.setFont(new Font("Serif", Font.PLAIN,12));
		add(texto, BorderLayout.CENTER);
		JPanel lamina_norte= new JPanel();
		micombo = new JComboBox();
		micombo.setEditable(true);
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospace");
		micombo.addItem("Dialog");
		lamina_norte.add(micombo);
		Evento_combo mievento = new Evento_combo();
		micombo.addActionListener(mievento);
		add(lamina_norte, BorderLayout.NORTH);
		
	}
	private JLabel texto;
	private JComboBox micombo;
	private class Evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//getselecteitem devuelve un object, y Font quiere un string como 1�argumento
			texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN,12));
		}
		
	}
}