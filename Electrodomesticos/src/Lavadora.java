
public class Lavadora extends Electrodomestico {
	private final int CARGA_DEF = 5;
	private int carga = 0;

	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
		
	}

	public Lavadora(int precio_base, int peso) {
		super(precio_base, peso);
		this.carga = CARGA_DEF;
		
	}

	public Lavadora(int precio_base, String color, char consumo_energetico,
			int peso, int carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}
	
	public int precioFinal(){
		//primero calculo el incremento por ser un electrodomestico
		int sumar = super.precioFinal();
		//ahora miro si tengo que incrementar por ser lavadora
		if (this.carga>30){
			sumar += 50;
		}
		
		return sumar;
	}

	public int getCarga() {
		return carga;
	}

}
