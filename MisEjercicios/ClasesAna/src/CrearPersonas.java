import java.util.Scanner;

public class CrearPersonas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Persona[] arrayPersonas = new Persona[3];
		
		Persona[] arrayPersonasOrdenado = new Persona[3];
		
		for (int i=0; i<3; i++) {
			arrayPersonas[i] = new Persona();
			arrayPersonasOrdenado[i] = new Persona();
			System.out.println("introduce un nombre");	
			arrayPersonas[i].nombre = entrada.next();
			System.out.println("introduce un apellidos");	
			arrayPersonas[i].apellidos = entrada.next() ;
			System.out.println("introduce un edad");
			arrayPersonas[i].edad = entrada.nextInt() ;
		}
		//otra forma de hacer lo anterior es crear el objeto persona, meterle los 
		//atributos y luego meter el objeto en el array
//		for (int i=0; i<3; i++) {
//			
//			Persona persona = new Persona(); //si no instancio esto dentro del bucle, siempre
											//estaria metiendo en todos indice del array el mismo objeto persona
										    //que habia definido fuera del bucle y tendria los atributos de la ultima perso
											//na introducida  que ha ido machacando los datos anterioes pq era la
											// misma instancia
//			System.out.println("introduce un nombre");	
//			persona.nombre = entrada.next();
//			System.out.println("introduce un apellidos");	
//			persona.apellidos = entrada.next() ;
//			System.out.println("introduce un edad");
//			persona.edad = entrada.nextInt() ;
//			arrayPersonas[i] = persona;
//		}
		
		for (int i=0; i<3; i++) {
			System.out.println(arrayPersonas[i].nombre + " " + arrayPersonas[i].apellidos + " " + arrayPersonas[i].edad);	
			
		}
		if ((arrayPersonas[0].edad < arrayPersonas[1].edad ) && (arrayPersonas[0].edad < arrayPersonas[2].edad )) {
			arrayPersonasOrdenado[0] =  arrayPersonas[0];
			if (arrayPersonas[1].edad < arrayPersonas[2].edad ) {
				arrayPersonasOrdenado[1] =  arrayPersonas[1];
				arrayPersonasOrdenado[2] =  arrayPersonas[2];
			} else {
				arrayPersonasOrdenado[1] =  arrayPersonas[2];
				arrayPersonasOrdenado[2] =  arrayPersonas[1];
			}
		} else {
			if ((arrayPersonas[1].edad < arrayPersonas[0].edad ) && (arrayPersonas[1].edad < arrayPersonas[2].edad )) {
				arrayPersonasOrdenado[0] =  arrayPersonas[1];
				if (arrayPersonas[0].edad < arrayPersonas[2].edad ) {
					arrayPersonasOrdenado[1] =  arrayPersonas[0];
					arrayPersonasOrdenado[2] =  arrayPersonas[2];
				} else {
					arrayPersonasOrdenado[1] =  arrayPersonas[2];
					arrayPersonasOrdenado[2] =  arrayPersonas[0];
				}
			} else {
				if (arrayPersonas[0].edad < arrayPersonas[1].edad )  {
					arrayPersonasOrdenado[0] =  arrayPersonas[2];
					arrayPersonasOrdenado[1] =  arrayPersonas[0];
					arrayPersonasOrdenado[2] =  arrayPersonas[1];
				} else {
					arrayPersonasOrdenado[0] =  arrayPersonas[2];
					arrayPersonasOrdenado[1] =  arrayPersonas[1];
					arrayPersonasOrdenado[2] =  arrayPersonas[0];
				}
			}
		}
				
	for (int i=0; i<3; i++) {
			System.out.println(arrayPersonasOrdenado[i].nombre + " " + arrayPersonasOrdenado[i].apellidos + " " + arrayPersonasOrdenado[i].edad);
			
		}
	}
	
}
