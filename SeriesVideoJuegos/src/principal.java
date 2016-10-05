import java.util.Scanner;

import javax.management.openmbean.ArrayType;


public class principal {

	public static void main(String[] args) {
		Entregable[] arraySeries = new Serie[5];
		Entregable[] arrayVideoJuegos = new Videojuegos[5];
		
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<5;i++){
			System.out.println("introduce titulo de serie");
			Entregable serie = new Serie(entrada.next(), entrada.next());
			arraySeries[i]=serie;
		}
		
		for (int i=0;i<5;i++){
			System.out.println("introduce titulo de videojuego");
			Entregable vj = new Videojuegos(entrada.next(), entrada.nextInt());
			arrayVideoJuegos[i]=vj;
		}
		
		for (int i=0;i<5;i++){
			if (arraySeries[i].isEntregado()){
				Serie s = (Serie)arraySeries[i];
				System.out.println(arraySeries[i].getTitulo());
			}
		}
		

	}

}
