package Clases;

public class Lavadora extends Electrodomestico {
	private int carga;
	protected final  int CARGA_DEF =5;
	
	
	
	public Lavadora() {
		//esta linea super() se la hemos tenido que añadir nosotros a mano
		super();
		this.carga = CARGA_DEF;
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;
	}

	public Lavadora(int precio, int peso, String color, char consumo, int carga) {
		super(precio, peso, color, consumo);
		this.carga =  carga;
	}

		public int precioFinal(){
			//primero calculo el incremento por ser un electrodomestico
			int sumar =super.precioFinal() ;
			sumar = (this.carga>50) ? sumar+50: sumar;
			
			return sumar;
		}
	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

}
