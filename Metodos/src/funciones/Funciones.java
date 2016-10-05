package funciones;

public class Funciones {
	
	public static int maximo(int[][] matriz){
		int max = Integer.MIN_VALUE;
		int cols = matriz[0].length;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<cols;j++){
				if (matriz[i][j]>max){
					max = matriz[i][j];
				}
			}
		}
		return max;
	}
	
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
	
	/**
	 * esta es la descripción de la función
	 * @param num descripción de los parámetros
	 * @return resultado
	 */
	public static int factorial(int num){
		for (int i=num-1;i>1;i--){
			num = num * i;
		}
		return num;
	}
}
