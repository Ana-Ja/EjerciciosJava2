import funciones.Funciones;

public class Matrices2{
	
	public static void main(String[] args) {
		
		//en el array matriz guardo todos los números
		int[][] matriz = new int[10][10];
		
		//utilizo tres arrays para guardar los 
		//max, min y medias de cada una de las filas
		int[] arrayMaximos = new int[10];
		int[] arrayMinimos = new int[10];
		int[] arrayMedias = new int[10];
		
		//utilizo dos fors anidados para rellenar la matriz
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				matriz[i][j] = (int)(Math.random()*31);
			}
		}
		
		//recorro las filas de la matriz calculando maximos, mínimos y medias
		for (int i=0;i<10;i++){
			arrayMaximos[i] = Funciones.maximo(matriz[i]);
			arrayMinimos[i] = Funciones.minimo(matriz[i]);
			arrayMedias[i] = Funciones.media(matriz[i]);
		}
		
		/*
		 * Devolver para cada fila:
		 * 		- el máximo
		 * 		- el mínimo
		 * 		- la media
		 * La máxima de todas las medias
		 * El máximo y el mínimo de la matriz
		 * La media de toda la matriz
		 * 
		 * */
		
		int maxMed = Funciones.maximo(arrayMedias);
		int maxMatriz = Funciones.maximo(arrayMaximos);
		int minMatriz = Funciones.minimo(arrayMinimos);
		int mediaMatriz = Funciones.media(arrayMedias);
				
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
