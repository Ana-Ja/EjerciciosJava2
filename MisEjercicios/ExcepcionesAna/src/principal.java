import java.util.InputMismatchException;
import java.util.Scanner;


public class principal {
	public static int multiplicar(int num1, int num2) throws Exception{
		int resultado=0;
		if  (num1<0 || num2<0) {
			throw new Exception();
		}
		  resultado = num1*num2;	
		  return resultado;
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		try{
			int multiplicado = multiplicar(entrada.nextInt(), entrada.nextInt());
			//codigo que puede provocer errores
			int[] vectorNums = new int[5];
			vectorNums[5] = 10;
		} catch(InputMismatchException e){
			System.out.println("el tipo introducido no es correcto");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			// este codigo se ejecutara si se produce un error
			// de este tipo
		} catch(Exception e) { 

			//gestión de la excepción si no es del tipo anterior
			System.out.println(e.getMessage()); //es la forma entendible de ver el error
			System.out.println(e.getStackTrace()); //me da toda la traza del error que querremos quie salga en un fichero de log
		}finally{
			//este codigo se ejecutara SIEMPRE
			
		}
	} 

}
