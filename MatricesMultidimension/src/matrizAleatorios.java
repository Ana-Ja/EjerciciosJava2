
public class matrizAleatorios {

	public static void main(String[] args) {
		
		
		double[][] aleatorio = new double[10][10];
		//nº aleatorio entre 0 y 9
        for ( int i=0; i<10; i++) {
        	
        	for ( int x=0; x<10; x++){
        		aleatorio[i][x]= (Math.random()*30)+1;
        		System.out.println("matriz(" + i +"," + x + ")" + aleatorio[i][x]);
			}
        }
	}

}
