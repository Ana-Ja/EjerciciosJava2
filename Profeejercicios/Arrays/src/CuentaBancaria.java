import java.util.Scanner;


public class CuentaBancaria {

	public static void main(String[] args) {
		//declaro el objeto Scanner para ller de teclado
		Scanner entrada = new Scanner(System.in);
		
		//leo la cuenta que introducen por teclado
		//String cuenta = entrada.nextLine();
		String ccc = "9080 1234 01 0000102030";
		
		//divido el número de cuenta en partes buscando los espacios
		String[] partes = ccc.split(" ");
		
		//concateno banco y sucursal y le pongo 
		//dos ceros por delante para realizar las 
		//multiplicaciones y tener 10 cifras
		String parte1 = "00"+partes[0]+partes[1];
		String dc = partes[2];
		String parte2  = partes[3];
		
		int dc1;
		int dc2;
		
		//monto el array de pesos para realizar los cálculos
		int[] valores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
		
		//utilizo un variable para llevar la suma acumulada
		int suma = 0;
		for (int i=0;i<parte1.length();i++){
			//multiplico el caractes que está en la posición iésima 
			//de la cuenta con el peso en la misma posición
			//el resultado lo añado a la suma acumulada
			suma = suma + (Character.getNumericValue(parte1.charAt(i))*valores[i]);
		}
		
		int resto = 11-(suma%11);
		if (resto==11){
			dc1=0;
		}else if(resto==10){
			dc1=1;
		}else{
			dc1 = resto;
		}
		//hago lo mismo para calcular el segundo dígito
		suma = 0;
		for (int i=0;i<parte2.length();i++){
			suma = suma + (Character.getNumericValue(parte2.charAt(i))*valores[i]);
		}
		
		resto = 11-(suma%11);
		if (resto==11){
			dc2=0;
		}else if(resto==10){
			dc2=1;
		}else{
			dc2 = resto;
		}
		
		if ((""+dc1+dc2).equals(dc)){
			System.out.println("OK");
		}else{
			System.out.println("ERROR");
		}
		
		

	}

}
