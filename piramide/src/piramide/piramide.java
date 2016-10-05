package piramide;

import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		String linea = "";
		int numero;
		System.out.println("introduzca un numero");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();		
		
		
		for (int i=1;i<=numero ; i++) {
			linea = linea + i;
			System.out.println(linea);
		}

	}

}
