import clases.Empleado;


public class ejer2Empleados {

	public static void main(String[] args) {
		//creo el primer empleado
		Empleado empleado = new Empleado("paco", 
													"porras", 
													18000, 
													"Desarrollador");
		
		System.out.println("El sueldo inicial es "+empleado.getSueldo());
		empleado.aplicarPlus();
		System.out.println("El sueldo final es "+empleado.getSueldo());
		
	}

}
