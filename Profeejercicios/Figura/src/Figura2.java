import java.util.Scanner;


public class Figura2 {

	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un número");
		n = entrada.nextInt();
		
		String linea = "";
		
		for (int i=1;i<=n;i++){
			linea = linea+i;
			System.out.println(linea);
		}

	}

}
