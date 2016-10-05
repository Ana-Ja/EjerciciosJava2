import java.util.Scanner;


public class operaciones {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		//num1=Integer.parseInt(entrada.nextLine());
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		num2 = entrada.nextInt();
		
		int resultado = num1*num2;
		
		System.out.println("El resultado es: "+resultado);
		entrada.close();
	}

}
