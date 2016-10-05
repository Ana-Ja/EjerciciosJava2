import java.util.Scanner;


public class CrearPersonas {

	public static void main(String[] args) {
//		System.out.println("Dame nombre");
//		Scanner entrada = new Scanner(System.in);
		
		Persona persona1 = new Persona("Ana", 17, 'M');
		Persona persona2 = new Persona();
		persona2.setNombre("Eva");
		persona2.setEdad(45);
		persona2.setSexo('S');
		persona2.setAltura(1.78);
		persona2.setPeso(100);
		System.out.println("persona1 imc " + persona1.calcularIMC());
		System.out.println("persona2 imc " + persona2.calcularIMC());
		System.out.println("persona1 mayor " + persona1.esMayorDeEdad());
		System.out.println("persona2 mayor " + persona2.esMayorDeEdad());
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
	}

}
