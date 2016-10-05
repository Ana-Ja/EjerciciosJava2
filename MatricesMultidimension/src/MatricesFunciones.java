
public class MatricesFunciones {
	
	public static int Maximo(int[] vector){
		int maximo = Integer.MIN_VALUE;
		for (int i = 0; i< vector.length; i++){
			if (vector[i] > maximo){
				maximo = vector[i];
			}
		}
		System.out.print("Funcion maximo " + maximo);
		return maximo;
	}
	public static int Minimo(int[] vector){
		int minimo = Integer.MAX_VALUE;
		for (int i = 0; i< vector.length; i++){
			if (vector[i] < minimo){
				minimo = vector[i];
			}
		}
		System.out.print("Funcion minimo " + minimo);
		return minimo;
	}
	public static int Media(int[] vector){
		int media = 0;
		for (int i = 0; i< vector.length; i++){
				media = media + vector[i];
		}
		System.out.print("Funcion media " + media/vector.length);
		return media;
	}
	
	public static int MaxMedia(int[] vector){
		int maxMed = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>maxMed){
				maxMed = vector[i];
			}
		}
		System.out.print("Funcion Maxmedia " + maxMed);
		return maxMed;
	}

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
		
		//recorro las filas de la matriz calculando metiendo en cada array el maximos, mínimos y medias
		for (int i=0;i<10;i++){
			arrayMaximos[i] = Integer.MIN_VALUE;
			arrayMinimos[i] = Integer.MAX_VALUE;
			arrayMedias[i] = 0;
			
			for (int j=0;j<10;j++){
				if (matriz[i][j]>arrayMaximos[i]){
					arrayMaximos[i] = matriz[i][j];
				}
				if (matriz[i][j]<arrayMinimos[i]){
					arrayMinimos[i] = matriz[i][j];
				}
				arrayMedias[i] = arrayMedias[i] + matriz[i][j];
			}
			arrayMedias[i] = arrayMedias[i]/10;
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
		
		
		//Maximo
		System.out.println(" maximo="+ Maximo(arrayMaximos));
		//Minimo
		System.out.println(" Minimo="+ Minimo(arrayMinimos));
		//Media
	    System.out.println(" Media="+ Media(arrayMedias));
	   //Media
	    System.out.println(" MaxMedia="+ MaxMedia(arrayMedias));
	    // El máximo y el mínimo de la matriz

//		
//		// El máximo y el mínimo de la matriz
//		int maxMax = Integer.MIN_VALUE;
//		for (int i=0;i<10;i++){
//			if (arrayMaximos[i]>maxMax){
//				maxMax = arrayMaximos[i];
//			}
//		}
//		System.out.println("El máximo d ela matriz es: "+ maxMax);
//		
//		int minMin = Integer.MAX_VALUE;
//		for (int i=0;i<10;i++){
//			if (arrayMinimos[i]<minMin){
//				minMin = arrayMinimos[i];
//			}
//		}
//		System.out.println("El mínimo d ela matriz es: "+ minMin);
//		
//		
//		//La media de toda la matriz
//		int medMed = 0;
//		for (int i=0;i<10;i++){
//			medMed = medMed + arrayMedias[i];
//		}
//		System.out.println("La media de la matriz es: "+ medMed/10);
//		
//		
		//Visualizo la matriz para comprobar
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}

