import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un n�mero");
		n = entrada.nextInt();
		
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
