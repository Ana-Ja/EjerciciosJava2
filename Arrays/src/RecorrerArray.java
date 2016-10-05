import java.util.Scanner;

public class RecorrerArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int[] arrayNums = new int[10];
		
		/*for (int i=0;i<arrayNums.length;i++){
			System.out.println("Introduce un numero");
			arrayNums[i] = entrada.nextInt();
		}
		
		//ahora muestro todas las posiciones por pantalla
		for (int i=0;i<arrayNums.length;i++){
			System.out.println(arrayNums[i]);
		}*/
		
		//un número aleatorio entre 0 y 10
		double resultado = Math.random()*10;
		System.out.println(resultado);

	}

}
