import java.util.Scanner;


public class DividirNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//declaro las variables que van a guardar el número en formato entero, en string, la longitud y el scanner
		int num;
		String lectura;
		int longitud;
		//pido el numero y lo leo
		System.out.println("Introduce un número");
		lectura = entrada.nextLine();

		//convierto el numero a entero
		num = Integer.parseInt(lectura);
		//obtengo la cantidad de dígitos introducidos
		longitud = lectura.length();
		
		//por cada dígito que contiene el número introducido
		for (int i=0;i<longitud;i++){
			//calculo el divisor
			int divisor = (int) Math.pow(10, longitud-1-i);
			
			System.out.println (num/divisor);
			num = num % divisor;
		}
	}

}
