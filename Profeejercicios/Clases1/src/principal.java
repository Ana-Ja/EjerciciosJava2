import java.util.Scanner;

import clases.Persona;

public class principal {

	public static void main(String[] args) {
		/*Persona persona1 = new Persona();
		persona1.nombre = "javi";
		persona1.apellidos = "heras";
		persona1.edad = 35;*/
		Persona persona1 = new Persona();
		
		Persona persona2 = new Persona();
		persona2.setNombre("paco");
		persona2.setEdad(45);
		
		Persona persona3 = new Persona();
		persona3.setNombre("Silvia");
		persona3.setEdad(27);
		
		Persona[] arrayPersonas = new Persona[10];
		
		Scanner entrada = new Scanner(System.in);
		
		
		for (int i=0;i<10;i++){
			Persona persona = new Persona();
			persona.setNombre(entrada.next());
			persona.setEdad(entrada.nextInt());
			
			arrayPersonas[i] = persona;
			
		}
		
		
		
		//pregunto si num1 es el mayor de todos
				if (persona1.getEdad() > persona2.getEdad() && persona1.getEdad()>persona3.getEdad()){
					//si lo es, entonces quiero saber si num2 es mayor que num3
					if (persona2.getEdad()>persona3.getEdad()){
						System.out.println(persona1.getNombre() + " " +persona2.getNombre() + " "+persona3.getNombre());
					//si num2 no es mayor que num3
					}else{
						System.out.println(persona1.getNombre() + " " +persona3.getNombre() + " "+persona2.getNombre());
					}
				}else if (persona2.getEdad()>persona1.getEdad() && persona2.getEdad()>persona3.getEdad()){
					if (persona1.getEdad()>persona3.getEdad()){
						System.out.println(persona2.getNombre() + " " +persona1.getNombre() + " " +persona3.getNombre());
					}else{
						System.out.println(persona2.getNombre() + " " +persona3.getNombre() + " " +persona1.getNombre());
					}
				}else{
					if (persona1.getEdad()>persona2.getEdad()){
						System.out.println(persona3.getNombre() + " " +persona1.getNombre()+ " " +persona2.getNombre());
					}else{
						System.out.println(persona3.getNombre() + " " +persona2.getNombre() + " " +persona1.getNombre());
					}
				}
		
		
		
		

	}

}
