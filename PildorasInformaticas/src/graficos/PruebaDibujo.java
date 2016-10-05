package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {

		MarconConDibujos mimarco = new MarconConDibujos();
		
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}	
	
	class MarconConDibujos extends JFrame{
		
		public MarconConDibujos() {
			setVisible(true);
			setSize(500,400);
			setLocation(400,200);
			setTitle("Primer dibujo");
			//creamos un objeto lamina y se la añadimos al marco
			LaminaConFiguras milamina = new LaminaConFiguras();
			add(milamina);
		}
	}
	//creamos una lamina que es donde pintaremos y la ponemos encima del marco
	//se puede poner mas de una lamina sobre el marco superpuesta como en photoshop
	class LaminaConFiguras extends JPanel{
		//llamamos al metodo que pinta sobre la lamina y lo sobreescribimos
		public void  paintComponent(Graphics g) {
			//llama al metodo de la superclase para que haga su trabajpo
			super.paintComponent(g);
			g.drawRect(50, 50, 200, 200);
			g.drawLine(100, 100, 300, 200);
			g.drawArc(50, 100, 100, 200, 120, 150);
		}
			
	}
	

