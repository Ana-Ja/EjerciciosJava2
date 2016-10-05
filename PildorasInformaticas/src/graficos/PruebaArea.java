package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoPruebaArea extends JFrame{
	public MarcoPruebaArea() {
		setBounds(500,300,500,350);
		setTitle("Probando Area de Texto");
		setLayout(new BorderLayout());
		
		//lamina sur con los botones
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de La Mancha de cuyo combre no quiero acordarme....");
			}
			
		});
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea = new JButton("Salto Linea");
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//almacenamos lo contrario de lo que hay
				boolean saltar=!areaTexto.getLineWrap();
				//siempre pasamos a setline lo contrario de lo que hay para que haya o no haya
				
				areaTexto.setLineWrap(saltar);
//				if (saltar){
//					botonSaltoLinea.setText("quitar salto");
//					
//				}else {
//					botonSaltoLinea.setText("Salto Linea");
//				}
				botonSaltoLinea.setText(saltar ? "Quitar Salto":"Salto Linea");
			}
			
		});
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		//Iniciamos area rexto y a�adimo el textarea a un scroll
		areaTexto= new JTextArea(8,20);
		Font miletra = new Font("Serif",Font.BOLD,24);
		areaTexto.setFont(miletra);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
		setVisible(true);
	}
	private JPanel laminaBotones;
	private JButton  botonInsertar;
	private JButton botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}
