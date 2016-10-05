
public class Principal {

	public static void main(String[] args) {
		Persona alumno = new Persona();
		alumno.nombre = "javi";
		alumno.apellidos= "heras";
		Persona alumno2 = new Persona();
		alumno2.nombre = "ana";
		alumno2.apellidos = "jarauta";
		
		//puedo crear un array con objetos de tipo persona
		Persona[] arrayPersonas = new Persona[10];
		arrayPersonas[1] = alumno;
	}

}
