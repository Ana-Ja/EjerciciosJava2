
import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		
		int edad;
		System.out.println("Introduce la edad:");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextInt();
		
		if (edad<18){
			System.out.println ("Crío!!!!!");
		}else if (edad >= 18 && edad<67){
			System.out.println ("eres mayor de edad");
		}else if(edad >= 67){
			System.out.println("al imserso!!!!");
		}
		
		entrada.close();
	}
}
