import java.util.Scanner;


public class primos {

	public static void main(String[] args) {
		System.out.println("introduce un número mayor que 1");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		//un número es primo si SÓLO es divisible
		//entre 1 y por si mismo
		boolean esPrimo = true;
		
		for (int i=2;i<num;i++){
			if (num%i==0){
				esPrimo = false;
			}
		}
		
		if (esPrimo){
			System.out.println("El numero es primo");
		}else{
			System.out.println("el numero no es primo");
		}

	}

}
