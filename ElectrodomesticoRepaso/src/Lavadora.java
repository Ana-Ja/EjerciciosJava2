
public class Lavadora extends Electrodomestico {
	private final double CARGA = 5;
	private double carga ;
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(double preciobase, String color, char consumo, double peso, double carga) {
		super(preciobase, color, consumo, peso);
		this.carga = carga;
	}


	public Lavadora(double preciobase, double peso) {
		super(preciobase, peso);
		this.carga = CARGA;
		// TODO Auto-generated constructor stub
	}

	public double precioFinal(){
		double precio;
		// primero se calcula su precio final por ser electrodomestico
		precio= super.precioFinal();
		if (this.carga>=30){
			precio +=50;
		}
	    return precio	;
	}
	
	public double getCarga() {
		return carga;
	}

}
