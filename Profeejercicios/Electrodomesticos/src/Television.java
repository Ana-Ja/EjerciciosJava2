
public class Television extends Electrodomestico {
	
	private int resolucion;
	private boolean sintonizadorTDT;

	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}

	public Television(int precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}

	public Television(int precio_base, String color, char consumo_energetico,
			int peso, int resolucion, boolean sintonizador) {
		super(precio_base, color, consumo_energetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}
	
	public int precioFinal(){
		int sumar = super.precioFinal();
		
		if (this.tieneSintonizadorTDT()){
			sumar += 50;
		}
		if (this.resolucion>40){
			sumar *= 1.30;
		}
		
		return sumar;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean tieneSintonizadorTDT() {
		return sintonizadorTDT;
	}

}
