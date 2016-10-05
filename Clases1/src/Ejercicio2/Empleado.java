package Ejercicio2;

import java.util.Scanner;

public class Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce Nombre");
		String nombre = entrada.next();
		System.out.println("Introduce edad");
		int edad = entrada.nextInt();
		System.out.println("Introduce Sexo");
		char sexo = entrada.next().charAt(0);
		System.out.println("Introduce peso");
		double peso = entrada.nextDouble();
		System.out.println("Introduce altura");
		double altura = entrada.nextDouble();
		claseEmpleado empleado1 = new claseEmpleado("ana", "", 5, 'M', 62,1.67);
		claseEmpleado empleadoteclado = new claseEmpleado(nombre, "", edad, sexo, peso, altura);
		System.out.println("Introduce Nombre");
		 nombre = entrada.next();
		System.out.println("Introduce edad");
		 edad = entrada.nextInt();
		System.out.println("Introduce Sexo");
		 sexo = entrada.next().charAt(0);
		claseEmpleado empleadoteclado2 = new claseEmpleado(nombre, edad, sexo);
		claseEmpleado empleadoteclado3 = new claseEmpleado();
		empleadoteclado3.setNombre("Ana");
		empleadoteclado3.setEdad(48);
		empleadoteclado3.setSexo('M');
		empleadoteclado3.setPeso(62);
		empleadoteclado3.setAltura(1.67);
		System.out.println("IMC de " + empleadoteclado.getNombre() + empleadoteclado.calcularIMC());
		System.out.println("IMC de " + empleadoteclado2.getNombre() + empleadoteclado2.calcularIMC());
		System.out.println("IMC de " + empleadoteclado3.getNombre() + empleadoteclado3.calcularIMC());
		System.out.println("Sexo " + empleadoteclado.comprobarSexo(empleadoteclado.getSexo()));
		System.out.println("Mayor de edad  " + empleadoteclado.getNombre() + empleadoteclado.esMayorEdad());
		System.out.println("Mayor de edad  " + empleadoteclado2.getNombre() + empleadoteclado2.esMayorEdad());
		System.out.println("Mayor de edad  " + empleadoteclado3.getNombre() + empleadoteclado3.esMayorEdad());
		System.out.println("DNI  " + empleadoteclado.getDni() );
		System.out.println("DNI  " + empleadoteclado2.getDni() );
		System.out.println("DNI  " + empleadoteclado3.getDni() );
	}

}
