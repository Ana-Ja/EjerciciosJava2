import java.util.Scanner;

import clases.Persona;


public class EjercicioPersonas {

	public static void main(String[] args) {
		System.out.println("Dame nombre, edad, sexo, peso y altura");
		Scanner entrada = new Scanner(System.in);
		
		Persona p1 = new Persona(
				entrada.next(),
				entrada.nextInt(), 
				entrada.next().charAt(0), 
				entrada.nextDouble(), 
				entrada.nextDouble());
		
		System.out.println("Dame nombre, edad, sexo");
		Persona p2 = new Persona(
				entrada.next(),
				entrada.nextInt(), 
				entrada.next().charAt(0));
		
		Persona p3 = new Persona();
		System.out.println("Dame nombre, edad, sexo");
		p3.setNombre(entrada.next());
		p3.setEdad(entrada.nextInt());
		p3.setSexo(entrada.next().charAt(0));
		
		if (p1.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p1.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else{
			System.out.println("Está por encima");
		}
		
		if (p2.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p2.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else{
			System.out.println("Está por encima");
		}
		
		if (p3.calcularIMC()<0){
			System.out.println("Está por debajo");
		}else if (p3.calcularIMC()==0){
			System.out.println("Está en su peso");
		}else{
			System.out.println("Está por encima");
		}
		
		
		int v = 1;
		
	}

}
