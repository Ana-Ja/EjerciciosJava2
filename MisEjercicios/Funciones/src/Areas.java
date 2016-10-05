import java.util.Scanner;


public class Areas {
	public static double area( int radio) {
				return Math.PI * Math.pow(radio, 2);
			}
	public static int area( int base, int altura) {
		return base*altura;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el radio de la circunferencia");				
		int radio = entrada.nextInt() ;
		System.out.println("area del cirdulo = " + area(radio
				));	
		System.out.println("introduce base del rectantulo");				
		int base = entrada.nextInt() ;
		System.out.println("introduce altura del rectantulo");	
		
		int altura = entrada.nextInt() ;  
		System.out.println("area del rectantulo = " + area(base, altura));	
		
;
	}

}
