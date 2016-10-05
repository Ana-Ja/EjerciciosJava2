
public class Matrices {

	public static void main(String[] args) {
		
		//en el array matriz guardo todos los n�meros
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
		
		//recorro las filas de la matriz calculando maximos, m�nimos y medias
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
		 * 		- el m�ximo
		 * 		- el m�nimo
		 * 		- la media
		 * La m�xima de todas las medias
		 * El m�ximo y el m�nimo de la matriz
		 * La media de toda la matriz
		 * 
		 * */
		
		for (int i=0;i<10;i++){
			System.out.print("La fila "+i+" tiene");
			System.out.print(" maximo="+arrayMaximos[i]);
			System.out.print(" minimo="+arrayMinimos[i]);
			System.out.print(" media="+arrayMedias[i]);
			System.out.println();
		}
		
		int maxMed = Integer.MIN_VALUE;
		for (int i=0;i<10;i++){
			if (arrayMedias[i]>maxMed){
				maxMed = arrayMedias[i];
			}
		}
		System.out.println("La m�xima de las medias es: "+ maxMed);
		
		int maxMax = Integer.MIN_VALUE;
		for (int i=0;i<10;i++){
			if (arrayMaximos[i]>maxMax){
				maxMax = arrayMaximos[i];
			}
		}
		System.out.println("El m�ximo d ela matriz es: "+ maxMax);
		
		int minMin = Integer.MAX_VALUE;
		for (int i=0;i<10;i++){
			if (arrayMinimos[i]<minMin){
				minMin = arrayMinimos[i];
			}
		}
		System.out.println("El m�nimo d ela matriz es: "+ minMin);
		
		int medMed = 0;
		for (int i=0;i<10;i++){
			medMed = medMed + arrayMedias[i];
		}
		System.out.println("La media de la matriz es: "+ medMed/10);
		
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
