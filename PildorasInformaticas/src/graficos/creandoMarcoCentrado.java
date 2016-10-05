package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado mimarco = new MarcoCentrado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoCentrado extends JFrame {
	public MarcoCentrado(){
		//la clase toolkit nos dira la resolucion del sitema huesped
		Toolkit mipantalla=Toolkit.getDefaultToolkit();  //devuelveme el medio en el que esta ejecutando el codigo(pantalla, movil....)
	    //devuelve la resolucion de la pantalla anchoxalto
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
	    int ancho = tamanoPantalla.width;
	    
	    int alto = tamanoPantalla.height;
	    
	    setSize(ancho/2, alto/2);
	    
	    setLocation(ancho/4, alto/4);
	    
	    setTitle("marco centrado");
	    
	    Image miicono =mipantalla.getImage("src/graficos/icono.gif"); //admite jpg png  ygif que pesa menos
	    
	    setIconImage(miicono);
	}
}