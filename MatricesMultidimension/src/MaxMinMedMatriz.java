
public class MaxMinMedMatriz {

	public static void main(String[] args) {
		int[][] aleatorio = new int[10][10];
		//nº aleatorio entre 0 y 9
        for ( int i=0; i<10; i++) {
        	
        	for ( int x=0; x<10; x++){
        		aleatorio[i][x]= (int)(Math.random()*31);
        		System.out.println("matriz(" + i +"," + x + ")" + aleatorio[i][x]);
			}
        }
        
        
       
        int maxFila = Integer.MIN_VALUE;
		int minFila = Integer.MAX_VALUE;
        int maxColumna = Integer.MIN_VALUE;
		int minColumna = Integer.MAX_VALUE;
        int mediaFila=0;
        int mediaColumna=0;
        int mediaMatriz=0;
        int[] MediaFila= new int[10];
        int[] MediaColumna= new int[10];
        
        //Maxima minima y media de cada fila
        for ( int i=0; i<10; i++) {
        	
        	for ( int x=0; x<10; x++){
        		if (aleatorio[i][x]<=minFila) {
        			minFila = aleatorio[i][x];
        		}
        		if (aleatorio[i][x]>=maxFila) {
        			maxFila = aleatorio[i][x];
        		}
        		mediaFila += aleatorio[i][x];
        		mediaMatriz += aleatorio[i][x];
			}
        	MediaFila[i] = mediaFila;
        	mediaFila = 0;
        	
        	
    		System.out.println("Media Fila(" + i + ")" + mediaFila/10);
    		System.out.println("Min Fila(" + i + ")" + minFila);
    		System.out.println("Max Fila (" + i + ")" + maxFila);
        }
        
      //Maxima minima y media de cada columna
        for ( int x=0; x<10; x++) {
        	
        	for ( int i=0; i<10; i++){
        		if (aleatorio[i][x]<=minColumna) {
        			minColumna = aleatorio[i][x];
        		}
        		if (aleatorio[i][x]>=maxColumna) {
        			maxColumna = aleatorio[i][x];
        		}
        		mediaColumna += aleatorio[i][x];
			}
        	MediaColumna[x] = mediaColumna;
        	mediaColumna = 0;
        	
        	
    		System.out.println("Media Columna(" + x + ")" + mediaColumna/10);
    		System.out.println("Min Columna(" + x + ")" + minColumna);
    		System.out.println("Max Columna (" + x + ")" + maxColumna);
        }
        
        
        // Maxima de todas las filas
        int maximaMedia = Integer.MIN_VALUE;
        for ( int i=0; i<10; i++) {
        	if (MediaFila[i]>=maximaMedia) {
        		maximaMedia = MediaFila[i];
    		}
        }
        System.out.println("Maxima de las Filas -----> "+  maximaMedia);
        
        
        //Maxima y minima de la matriz
        int maxMatriz = Integer.MIN_VALUE;
        int minMatriz = Integer.MAX_VALUE;
        for ( int i=0; i<10; i++) {
        	
        	for ( int x=0; x<10; x++){
        		
        	}
        	
        }	
	}

}
