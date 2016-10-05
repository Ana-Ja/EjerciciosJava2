
public class Electrodomestico {
	protected final String COLOR_BASE = "blanco";
	protected final char LETRA_BASE = 'F';
	private double preciobase=0;
	private String color;
	private char  consumo;
	private double peso;
	
	public Electrodomestico(){
		this.preciobase = 100;
		this.color = COLOR_BASE;
		this.consumo = LETRA_BASE;
		this.peso = 5;
	}
	public Electrodomestico(double preciobase, String color, char consumo,
			double peso) {
		
		this.preciobase = preciobase;
		comprobarColor(color);
	    comprobarConsumoEnergetico(consumo);
		this.peso = peso;
	}
	public Electrodomestico(double preciobase, double peso) {
		
		this.preciobase = preciobase;
		this.peso = peso;
		this.color = COLOR_BASE;
		this.consumo = LETRA_BASE;
	}
	
	//los declaro protected para que los puedan usar las clases hijas
	protected void comprobarConsumoEnergetico(char letra){
		//directamente relleno el atributo
		this.consumo = (letra>='A' && letra<='F') ? letra: LETRA_BASE;
		//otra forma es devolviendo el valor
		//return (letra>='A' && letra<='F') ? letra: LETRA_BASE;
	}
	
	protected void  comprobarColor(String color){
		 String [] matriz_color= {"blanco", "negro","rojo", "azul", "gris"};
		 boolean encontrado = false;
		 for (int i=0;i<matriz_color.length;i++)
		 {
			 if (color.equals((matriz_color[i].toLowerCase()))) {
				 encontrado=true;
			 }
		 }
		 if (encontrado==false){
			 this.color= color.toLowerCase();
		 } else {
			 this.color= COLOR_BASE;
		 }
//		switch (color){
//		case "blanco":
//			break;
//		case "negro":
//			break;
//		case "rojo":
//			break;	
//		case "azul":
//			break;
//		case "gris":
//			break;
//		default:
//			this.color=COLOR_BASE;
//		}
		//return color;
	}
	public double precioFinal(){
		
		double preciofinal= this.preciobase;
		switch (this.consumo){
		case 'A':
			preciofinal += 100;
			break;
		case 'B':
			preciofinal += 80;
			break;
		case 'C':
			preciofinal += 60;
			break;		
		case 'D':
			preciofinal += 50;
			break;
		case 'E':
			preciofinal += 30;
			break;	
		case 'F':
			preciofinal += 10;
			break;
		}
		if (this.peso<=19){
			preciofinal += 10;
		} else if (this.peso>=20 && this.peso<=49){
			preciofinal += 50;
		} else  if (this.peso>=50 && this.peso<=79){
			preciofinal += 80;
		} else {
			preciofinal += 100;
		}
		return preciofinal;
		
	}
	
	public double getPreciobase() {
		return preciobase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo() {
		return consumo;
	}
	public double getPeso() {
		return peso;
	}
	
	
}
