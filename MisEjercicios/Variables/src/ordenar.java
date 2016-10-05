import java.util.Scanner;


public class ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println ("Introduce 3 números");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		//pregunto si num1 es el mayor de todos
		if (num1 > num2 && num1>num3){
			//si lo es, entonces quiero saber si num2 es mayor que num3
			if (num2>num3){
				System.out.println(num1 + " " +num2 + " "+num3);
			//si num2 no es mayor que num3
			}else{
				System.out.println(num1 + " " +num3 + " "+num2);
			}
		}else if (num2>num1 && num2>num3){
			if (num1>num3){
				System.out.println(num2 + " " +num1 + " " +num3);
			}else{
				System.out.println(num2 + " " +num3 + " " +num1);
			}
		}else{
			if (num1>num2){
				System.out.println(num3 + " " +num1 + " " +num2);
			}else{
				System.out.println(num3 + " " +num2 + " " +num1);
			}
		}

	}

}
