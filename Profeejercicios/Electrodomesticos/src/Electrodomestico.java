
public class Electrodomestico {
	protected final String COLOR_DEF = "blanco";
	protected final char CONSUMO_ENERG_DEF = 'F';
	
	private int precio_base;
	private String color;
	private char consumo_energetico;
	private int peso;

	public Electrodomestico() {
		this.color = "blanco";
		this.consumo_energetico = CONSUMO_ENERG_DEF;
		this.precio_base = 100;
		//modifico el peso de electrodosfda
		this.peso = 5;
	}
	
	public Electrodomestico(int precio_base, int peso){
		this.color = "blanco";
		this.consumo_energetico = CONSUMO_ENERG_DEF;
		this.precio_base = precio_base;
		this.peso = peso;
	}

	/**
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 */
	public Electrodomestico(int precio_base, String color,
			char consumo_energetico, int peso) {
		this.precio_base = precio_base;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}
	
	protected void comprobarConsumoEnergetico(char letra){
		if (letra>='A' && letra<='F'){
			this.consumo_energetico = letra;
		}else{
			this.consumo_energetico = CONSUMO_ENERG_DEF;
		}
	}
	
	protected void comprobarColor(String color){
		String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
		
		boolean encontrado = false;
		for (int i = 0;i<colores.length;i++){
			if (colores[i].equals(color.toLowerCase())){
				encontrado = true;
			}
		}
		
		if (encontrado){
			this.color = color.toLowerCase();
		}else{
			this.color = this.COLOR_DEF;
		}
	}
	
	public int precioFinal(){
		int sumar = 0;
		switch (this.consumo_energetico) {
		case 'A':
			sumar += 100;
			break;
		case 'B':
			sumar += 80;
			break;
		case 'C':
			sumar += 60;
			break;
		case 'D':
			sumar += 50;
			break;
		case 'E':
			sumar += 30;
			break;
		case 'F':
			sumar += 10;
			break;
		}
		
		if (this.peso<20){
			sumar +=10;
		}else if(this.peso<50){
			sumar += 50;
		}else if(this.peso<80){
			sumar +=80;
		}else if(this.peso>=80){
			sumar += 100;
		}
		
		return this.precio_base + sumar;
	}
	
	
	public int getPrecio_base() {
		return precio_base;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public int getPeso() {
		return peso;
	}

	

}
