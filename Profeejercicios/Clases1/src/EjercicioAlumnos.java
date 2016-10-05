import clases.Alumno;
import clases.Persona;

public class EjercicioAlumnos {

	public static void main(String[] args) {
		Persona p1 = new Persona("paco", 45,'H');
		
		Alumno a1 = new Alumno("patxi",24,'H');
		
		a1.matricular();
		
		System.out.println(a1.getNombre()+" está matriculado en "+a1.getAsignaturas());

	}

}
