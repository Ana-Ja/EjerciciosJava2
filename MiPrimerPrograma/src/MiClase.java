import java.util.Random;
import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		
	
		/**comentarios **/
		//funci�n que muestra texto por pantalla
		System.out.println("hola");
		System.out.println("Introduce tu nombre");
		
		//declaro la variable entrada que pertenece 
		//a la clase scanner y leerr� del teclado
		Scanner entrada = new Scanner(System.in);
		//creo una variable para guardar el nombre del usuario
		String nombre = entrada.nextLine();
		
		System.out.println("Hola "+nombre+" que tal");
		
		
	}
}







