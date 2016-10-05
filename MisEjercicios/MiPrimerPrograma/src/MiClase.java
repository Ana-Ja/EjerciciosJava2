import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		//función que muestra texto por pantalla
		System.out.println("hola");
		System.out.println("Introduce tu nombre");
		
		//declaro la variable entrada que pertenece 
		//a la clase scanner y leerrá del teclado
		Scanner entrada = new Scanner(System.in);
		//creo una variable para guardar el nombre del usuario
		String nombre = entrada.nextLine();
		
		System.out.println("Hola "+nombre+" que tal");
		
		
	}
}







