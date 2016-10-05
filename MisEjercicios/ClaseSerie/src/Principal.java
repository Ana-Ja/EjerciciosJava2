import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		//creo un array de tipo entregable que contiene objetos de la clase Serie y otro de videojuegos
		//solucion del profe
		
//		Entregable[] arraySeries = new Serie[5];
//		Entregable[] arrayVideoJuegos = new Videojuegos[5];
//		
//		Scanner entrada = new Scanner(System.in);
//		for (int i=0;i<5;i++){
//			System.out.println("introduce titulo de serie");
//			Entregable serie = new Serie(entrada.next(), entrada.next());
//			arraySeries[i]=serie;
//		}
//		
//		for (int i=0;i<5;i++){
//			System.out.println("introduce titulo de videojuego");
//			Entregable vj = new Videojuegos(entrada.next(), entrada.nextInt());
//			arrayVideoJuegos[i]=vj;
//		}
//		
//		for (int i=0;i<5;i++){
//			if (arraySeries[i].isEntregado()){
//				Serie s = (Serie)arraySeries[i];
//				System.out.println(arraySeries[i].getTitulo());
//			}
//		}
		
		
		//Asi lo he hecho yo pero aunque esta bien y funciona, lo correcto hubiera sido hacerlo usando Entregable
		//el profe lo ha hecho correctamente en su version
		Videojuego[] videojuego = new Videojuego[5];
		Serie[] serie = new Serie[5];
		int cuenta_series=0;
		int cuenta_videos=0;
		int max_horas = 0;
		int max_temporadas = 0; 
		int indice_serie = 0 ;
		int indice_videos=0;
		//for ( int i=0; i<=5; i++) {
			videojuego[0] = new Videojuego();
			videojuego[0].setTitulo("Titulo") ;
			videojuego[0].setHoras_estimadas(5) ;
			videojuego[0].setGenero("drama") ;
			videojuego[0].setCompañia("CIA");
			videojuego[1] = new Videojuego();
			videojuego[1].setTitulo("Titulo2") ;
			videojuego[1].setHoras_estimadas(14) ;
			videojuego[1].setGenero("comica") ;
			videojuego[1].setCompañia("QQQQ");
			videojuego[2] = new Videojuego("Titulo3", 28);
			videojuego[3] = new Videojuego("Titulo4", 1);
			videojuego[4] = new Videojuego("Titulo5", 20);
			serie[0] = new Serie();
			serie[0].setTitulo("Serie 1");
			serie[0].setCreador("Dios");
			serie[0].setGenero("drana");
			serie[0].setNum_temporadas(7);
			serie[1] = new Serie();
			serie[1].setTitulo("Serie 2");
			serie[1].setCreador("Jesus");
			serie[1].setGenero("ficcion");
			serie[1].setNum_temporadas(1);
			serie[2] = new Serie();
			serie[3] = new Serie();
			serie[4] = new Serie();
		//}
			videojuego[0].entregar();
			serie[0].entregar();
			
			
			for ( int i=0; i<=4; i++) {
				if (videojuego[i].esEntregado()) {
					cuenta_videos++;
					System.out.println("Videojuego [" + i + "] entregado "+ videojuego[i].toString());
				}
				if (serie[i].esEntregado()) {
					cuenta_series++;
					System.out.println("Serie [" + i + "] entregado "+ serie[i].toString());
				}
				if (videojuego[i].getHoras_estimadas() >= max_horas) {
					max_horas = videojuego[i].getHoras_estimadas();
					indice_videos = 1;
				}
				if (serie[i].getNum_temporadas() >= max_temporadas) {
					max_temporadas = videojuego[i].getHoras_estimadas();
					indice_serie = i;
				}
			}
			System.out.println("Videos entregado  " +  cuenta_videos);
			System.out.println("Series entregadas  " +  cuenta_series);
			System.out.println("Serie con mas temporadas " + serie[indice_serie].toString());
			System.out.println("Videojuegos con mas horas " + videojuego[indice_videos].toString());
	}

}
