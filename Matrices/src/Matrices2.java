
public class Matrices2{
	
	public static int maximo(int[] vector){
		int result = Integer.MIN_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]>result){
				result = vector[i];
			}
		}
		return result;
	}
	
	public static int minimo(int[] vector){
		int result = Integer.MAX_VALUE;
		for (int i=0;i<vector.length;i++){
			if (vector[i]<result){
				result = vector[i];
			}
		}
		return result;
	}
	
	public static int media(int[] vector){
		int medMed = 0;
		for (int i=0;i<vector.length;i++){
			medMed = medMed + vector[i];
		}
		return(medMed/vector.length);

	}

	public static void main(String[] args) {
		
		int[] miArray = {3,2,7,9};
		int max = maximo(miArray);
		
		System.out.println("El máximo es" + max);
		
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
			arrayMaximos[i] = maximo(matriz[i]);
			arrayMinimos[i] = Integer.MAX_VALUE;
			arrayMedias[i] = 0;
			for (int j=0;j<10;j++){
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
		
		int maxMed = maximo(arrayMedias);
		
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
