import java.util.InputMismatchException;
import java.util.Scanner;


public class principal {
	
	public static int sumar(int num1, int num2) throws Exception{
		int resultado=0;
		if (num1<0 || num2<0){
			throw new ExcepcionPersonalizada("mensaje que quiero mostrar");
		}
		resultado = num1+num2;
		return resultado;		
	}
	
	public static float dividir(float num1, float num2) throws Exception{
		float resultado=0;
		if (num2==0){
			throw new ExcepcionPersonalizada("El segundo operador debe ser distinto de cero");
		}
		resultado = num1/num2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try{
			System.out.println("Introduce el primer número");
			int a = entrada.nextInt();
			System.out.println("Introduce el segundo número");
			int b = entrada.nextInt();
			System.out.println(dividir(a,b));
		}catch (InputMismatchException e){
			//esta excepción controla la introducción de tipos de datos no válidos
			System.out.println("El tipo de dato introducido no es correcto");
		}catch(ExcepcionPersonalizada e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			/*
			 * Si el error producido no coincide con ninguno de los
			 * indicados anteriormente, se ejecutará este código
			 */
			System.out.println(e.getMessage());
			//System.out.println(e.getStackTrace());
		}finally{
			//este código se ejecutará SIEMPRE
			//System.out.println("hemos acabado");
		}

	}

}
