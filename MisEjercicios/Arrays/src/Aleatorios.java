
public class Aleatorios {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int numero;
		boolean encontrado;
		
		for (int i=0;i<10;i++){
			do{
				numero = (int)(Math.random()*101);
				encontrado = false;
				for (int j=0;j<=i;j++){
					if (numeros[j]==numero){
						encontrado = true;
					}
				}				
			}while(encontrado==true);
			
			numeros[i] = numero;
		}
		
		System.out.println(numeros.toString());
	}

}
