package graficos;

import java.awt.Font;

import javax.swing.*;

public class MarcoSlider {

	public static void main(String[] args) {
		Frame_Slider mimarco = new Frame_Slider();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Frame_Slider extends JFrame{
	public Frame_Slider() {
		setBounds(500,300,500,350);
		
		Lamina_Slider milamina = new Lamina_Slider();
		add(milamina);
		setVisible(true);
	}
}
class Lamina_Slider extends JPanel{
	public Lamina_Slider(){
		//la interfa
		JSlider control = new JSlider(20,100,25);
		//control.setOrientation(SwingConstants.VERTICAL);
		//marcas
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);;
		control.setPaintTicks(true);
		add(control);
		//cambio las fuentes y pinto los nnumeros
		control.setFont(new Font("Serif", Font.ITALIC,12));;
		control.setPaintLabels(true);
		//con esta instruccion si dejamos el slider entre un punto intermedio entre dos
		//marcas, hace como iman y el solo se mueve a la marca mas cercana
		control.setSnapToTicks(true);
		
	}
}