package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafico2D {

	public static void main(String[] args) {
		MarconConDibujos2 mimarco = new MarconConDibujos2();
				
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarconConDibujos2 extends JFrame{
	
	public MarconConDibujos2() {
		setVisible(true);
		setSize(500,400);
		setLocation(400,200);
		setTitle("Primer dibujo");
		//creamos un objeto lamina y se la añadimos al marco
		LaminaConFiguras2 milamina = new LaminaConFiguras2();
		add(milamina);
	}
}
//creamos una lamina que es donde pintaremos y la ponemos encima del marco
//se puede poner mas de una lamina sobre el marco superpuesta como en photoshop
class LaminaConFiguras2 extends JPanel{
	//llamamos al metodo que pinta sobre la lamina y lo sobreescribimos
	public void  paintComponent(Graphics g) {
		//llama al metodo de la superclase para que haga su trabajpo
		super.paintComponent(g);
		//creamos un objeto de tipo Graphics2D con la refundicion
		//henmos convertido nuestro objeto de tipo graphic a graohics2D
		Graphics2D g2 = (Graphics2D) g;
		//hay que instanciar la clase rectangule2D pero como es abstracta
		//no se puede instanciar directamente por lo que usaremos la clase
		//hija Rectanguel2D.Double por el principio de sustitucion 'Es un'
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		//ahora hay que utilizar el metodo draw de la clase Graphics2D
		//que necesita un argum de tipo Shape y rectangule2D implementa el interface Shape
		g2.draw(rectangulo);
		
		//dibujamos una elipse dentro del rectangulo anterior
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		//linea
		g2.draw(new Line2D.Double(100,100,300,250));
		
		//ahora vamos a diubjar una circunferencia por fuera del rectagulo tomando
		//como centro el centro del rectangulo(getcentrex getcentry).
		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		g2.draw(circulo);
	}
		
}