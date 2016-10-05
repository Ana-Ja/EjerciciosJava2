import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Dame dos números");
		Scanner entrada = new Scanner(System.in);
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		int res = suma(numero1, numero2);
		
		System.out.println("El resultado es "+res);
	}
	
	/**
	 * función que suma dos números
	 * @param num1: primero número a sumar
	 * @param num2: segundo número a sumar
	 * @return resultado de sumar num1+num2
	 */
	public static int suma(int num1, int num2){
		int resultado=0;
		resultado = num1+num2;
		return resultado;
	}

}
