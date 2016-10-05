import java.util.InputMismatchException;
import java.util.Scanner;


public class principal {
	
    public static int entradaNumero() {
    	Scanner entrada = new Scanner(System.in);
    	int numero =  entrada.nextInt();
    	return numero;
    }
    
    public static boolean comprobaciones(int longitud, int posicion) throws Exception{
    	if (posicion > longitud -1) {
    		throw new ExcepcionesPersonalizadas("La posicion es mayor que el tamaño del array");
    	}
    	 return true;
    }
    
    
	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		try{
			System.out.println("Introduce longitud del array");
			int longitud = entradaNumero();
			int[] array = new int[longitud];
			for(int i = 0;i<longitud; i++) {
				System.out.println("Introduce el valor");
				int valor =  entradaNumero();;	
				System.out.println("Introduce la posicion");
				int posicion =   entradaNumero();
				comprobaciones(longitud, posicion);
				array[posicion] = valor;
			}
			
		}catch (InputMismatchException e){
			//esta excepción controla la introducción de tipos de datos no válidos
			System.out.println("El tipo de dato introducido no es correcto");
		}catch(ExcepcionesPersonalizadas e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Problemas");
		}finally{
			System.out.println("Se acabó");
		}
	}

}
