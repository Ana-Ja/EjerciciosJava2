package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
class MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		setTitle("Primer texto");
		//creamos un objeto lamina y se la añadimos al marco
		Lamina milamina = new Lamina();
		add(milamina);
	}
}
//creamos una lamina que es donde pintaremos y la ponemos encima del marco
//se puede poner mas de una lamina sobre el marco superpuesta como en photoshop
class Lamina extends JPanel{
	//llamamos al metodo que pinta sobre la lamina
	public void  paintComponent(Graphics g) {
		//llama al metodo de la superclase para que haga su trabajpo
		super.paintComponent(g);
		//damos texto y posicio x e y del borde izqdo y superior del marco
		g.drawString("estamos aprendiendo swing", 100,100);
	}
}