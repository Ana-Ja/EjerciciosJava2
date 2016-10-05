import clases.Alumno;
import clases.Persona;


public class EjercicioAlumno {

	public EjercicioAlumno() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("paco", 45, 'H');
		
		Alumno a1 = new Alumno("pachi", 22, 'M');
		a1.matricular();
		
		
		System.out.println(a1.getNombre() + " esta matriculado en " + a1.getAsignaturas());
		
		
	}

}
