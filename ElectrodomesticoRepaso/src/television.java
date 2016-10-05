
public class television extends Electrodomestico {
	private final int DEF_RESOLUCION= 5;
	private final boolean DEF_TDT= false;
	private int resolucion;
	private boolean tdt;
	
	public television() {
		super();
		this.resolucion = DEF_RESOLUCION;
		this.tdt = DEF_TDT;
	}

	public television(double preciobase, String color, char consumo, double peso, int resolucion, boolean tdt) {
		super(preciobase, color, consumo, peso);
		this.resolucion = DEF_RESOLUCION;
		this.tdt = DEF_TDT;
	}

	public television(double preciobase, double peso) {
		super(preciobase, peso);
		this.resolucion = DEF_RESOLUCION;
		this.tdt = DEF_TDT;
	}

	public double precioFinal(){
		//primero calculo el incremento por ser un electrodomestico
		double sumar = super.precioFinal();
		//ahora miro si tengo que incrementar por ser lavadora
		if (this.resolucion>40){
			sumar+= sumar * 1.50;
		}
		if (this.tdt){
			sumar+= 50;
		}
		
		return sumar;
	}
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}

}
