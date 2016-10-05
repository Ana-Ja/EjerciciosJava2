package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		FrameSpinner mimarco = new FrameSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class FrameSpinner extends JFrame{
	public FrameSpinner() {
		setBounds(500,300,500,350);
		
		LaminaSpinner milamina = new LaminaSpinner();
		add(milamina);
		setVisible(true);
	}
}
class LaminaSpinner extends JPanel{
	public LaminaSpinner(){
		JSpinner control = new JSpinner();
		add(control);
		//podemos acotar los valores, y poner tope por aarriba o abajo, 
		//o poner saltos  
		//los argumentos son: inicio, minimo,maximo, salto
		JSpinner control5 = new JSpinner(new SpinnerNumberModel(5,0,10,1));
		add(control5);
		
		//con fechas
		JSpinner control2 = new JSpinner(new SpinnerDateModel());
		add(control2);
		
		//con lista
		String lista[]= {"enero", "febrero", "marzo", "Abril"};
		JSpinner control3 = new JSpinner(new SpinnerListModel(lista));
		
		//le indicamos el tama�o al control
		//si hiboeramos usado un BorderLayout se hubiera adaptamo yno 
		//hubieramos tenido que definir tama�o
		Dimension d= new Dimension(200,20);
		control3.setPreferredSize(d);
		add(control3);
		//creo un spinner con todas las fuentes de mi ordeandor
		String fuentes[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control4 = new JSpinner(new SpinnerListModel(fuentes));
		Dimension d2= new Dimension(200,20);
		control4.setPreferredSize(d2);
		add(control4);
		
		//cremao un control con nuestro propio modelo que cambia el comportamiento
		//de los btones
		JSpinner control6 = new JSpinner(new MiModeloJSpinner());
		add(control6);
		//vamos a hacerlo con una clase interna anonima para simplificar codigo
		JSpinner control7 = new JSpinner(new SpinnerNumberModel(8,0,10,1){
			//esta es la clase interna donde pondremos el codigo a realizar
			//que es sobreescribir los metodos
			
			//sobreescribimos los metodos para obtener el anterior y previo
			public Object getNextValue(){
				//sobrrescribimos el metodo next y le decimo que haga lo
				//del metrodo previus
				return super.getPreviousValue();
			}
			public Object getPreviousValue(){
				return super.getNextValue();
			}
		});
		add(control7);
	}
	//creamos la clase interna que herede de SpinnerNumberModel para tener todos sus metodos
	//y su funcionamiento
	private class MiModeloJSpinner extends SpinnerNumberModel{
		//determinamos los valores de inicio, y de cuanto en cuanto
		public MiModeloJSpinner(){
			super(8,0,10,1); //llamos al constructo de la clase padre
			
		}
		//sobreescribimos los metodos para obtener el anterior y previo
		public Object getNextValue(){
			//sobrrescribimos el metodo next y le decimo que haga lo
			//del metrodo previus
			return super.getPreviousValue();
		}
		public Object getPreviousValue(){
			return super.getNextValue();
		}
	}
}