import java.util.Scanner;

import clases.Password;


public class ejercicioPass {

	public static void main(String[] args) {
		System.out.println("Dame la longitud del array");
		Scanner entrada = new Scanner(System.in);
		int longitud = entrada.nextInt();
		
		Password[] arrayPasswords = new Password[longitud];
		Boolean[] arrayFuertes = new Boolean[longitud];
		
		System.out.println("Dame la longitud de las contraseñas");
		int longPass = entrada.nextInt();
		
		for (int i = 0;i<longitud;i++){
			arrayPasswords[i] = new Password(longPass);
			arrayFuertes[i] = arrayPasswords[i].esFuerte();
			System.out.print(arrayPasswords[i].getContrasena());
			System.out.println(arrayFuertes[i]);
		}
		
		Password pass = new Password(20);
		pass.generarPassword();
		
		System.out.println(pass.getContrasena());
		System.out.println(pass.esFuerte());
	}

}
