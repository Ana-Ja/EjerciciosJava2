package Clases;

public class Television extends Electrodomestico {
	private int pulgadas;
	private boolean sintonizador;
	protected final  int PULGADAS_DEF =20;
	protected final  boolean SINTONIZADOR_DEF = false;
	
	
	public Television() {
		super();
		this.pulgadas = PULGADAS_DEF;
		this.sintonizador = SINTONIZADOR_DEF;
	}

	public Television(int precio, int peso) {
		super(precio, peso);
	}

	public Television(int precio, int peso, String color, char consumo, int pulgadas, boolean sintonizador) {
		super(precio, peso, color, consumo);
		this.sintonizador = sintonizador;
		this.pulgadas = pulgadas;
	}

	public int precioFinal() {
		int suma = 0 ;
		suma += super.precioFinal();
		if (this.pulgadas>40 ) {
			suma *= 1.3;
		}
		if (this.sintonizador) {
			suma += 50;
		}
		
		return this.precioFinal() + suma;
	}
	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @return the sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

}
