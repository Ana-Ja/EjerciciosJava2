
public class EjerEmpleado {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("paco", "porrar", 18000, "Desarrollador");
		System.out.println("El sueldo inicial es " + empleado.getSalario());
		 empleado.AplicarPlus();
		 System.out.println("El sueldo final es " + empleado.AplicarPlus());
	}  

}
