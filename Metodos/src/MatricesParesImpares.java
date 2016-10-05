
public class MatricesParesImpares {
	
	public static int matrizPares(int[][] matriz){
		int veces=0;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[0].length;j++){
				int num;
				do{
					num = (int)(Math.random()*101);
					veces++;
				}while (num%2!=0);
				veces--;
				matriz[i][j]= num;
			}
		}
		return veces;
	}

	public static void main(String[] args) {
		int[][] matriz =new int[4][10];
		System.out.println(matriz[0].length);
		matrizPares(matriz);
		System.out.println("adios");
	}

}
