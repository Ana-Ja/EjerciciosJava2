import java.util.Scanner;


public class aparicionNumero {
	
	public static  int busqueda (int[][] arrayNums, int numero) {
		int veces=0;
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
				if (arrayNums[i][j] == numero){
					veces++;
					if (veces > 0) {
						System.out.println("posicion ("+ i + " , " + j +")");	
					} 
				}			
			}
		}
		if (veces == 0) {
			System.out.println("Lo siento. El numero " + numero + " no aparece.");	
		}	
		return 0;
		
	}
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
				matriz[i][j] = (int)(Math.random()*31);
			}
		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un numero");				
		int numero = entrada.nextInt() ;
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		busqueda(matriz, numero);
	}

}
