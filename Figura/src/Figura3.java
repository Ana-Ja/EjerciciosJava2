import java.util.Scanner;


public class Figura3 {

	public static void main(String[] args) {
		/*
		 * Dano n=5 quiero escribir por pantalla lo siguiente
		 * 
		 * 5 4 3 2 1
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1 
		 * 1
		 * 
		 * */
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un número");
		n = entrada.nextInt();
		
		for (int i=n;i>=1;i--){
			for (int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
