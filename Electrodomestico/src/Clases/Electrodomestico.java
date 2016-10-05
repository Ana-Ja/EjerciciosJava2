package Clases;

public class Electrodomestico {
	private int precioBase;
	private String color;
	private char consumo;
	private float peso;
	private String[] arrayColor = { "blanco", "negro", "rojo", "azul", "gris"};
	private int[] letraPrecio = {100,80,60,50,30, 10};
	private int[] pesoPrecio = {10,50,80,100};
	
	public Electrodomestico() {
		this.color = "blanco";
		this.peso = 5;
		this.precioBase = 100 ;
		this.consumo = 'F';
		
	}
	public Electrodomestico(int precio, float peso) {
		this.color = "blanco";
		this.consumo = 'F';
		this.precioBase = precio;
		this.peso = peso;
		
	}
	public Electrodomestico(int precio, float peso, String color, char consumo) {
		comprobarColor(color);
		this.precioBase = precio;
		this.peso = peso;
		comprobarConsumoEnergetico(consumo);
	}
	private char comprobarConsumoEnergetico(char letra){
		if ( letra >'F') {
			letra = 'F';
		}
		return letra;
	}
	
	private String comprobarColor(String color) {
		boolean correcto= false;
		for (int i=0; i<5;i++) {
			if (arrayColor[i].equals(color.toUpperCase()) || arrayColor[i].equals(color.toLowerCase())   ) {
				correcto = true;
			}
		}
		if (correcto== true) {
			return color;
		} else {
			return "blanco";
		}
		
	}
	public int precioFinal(){
		int nuevoPrecio=0;
		nuevoPrecio += letraPrecio[this.consumo];
		
		if (this.peso <=19) {
			nuevoPrecio += pesoPrecio[0];			
		} else if (this.peso <=49) {
			nuevoPrecio += pesoPrecio[1];	
		}else if (this.peso <=79) {
			nuevoPrecio += pesoPrecio[2];	
		} else {
			nuevoPrecio += pesoPrecio[3];
		}
		
		return nuevoPrecio;
	}
	
	/**
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}


	

}
