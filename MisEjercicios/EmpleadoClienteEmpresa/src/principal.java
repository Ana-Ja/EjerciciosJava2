import clases.Cliente;
import clases.Empleado;
import clases.Empresa;
import clases.Persona;



public class principal {
	public static String maximoSueldo(Empleado[] array){
		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;
		int suma =0;
		String empleado="";
		
		for (int i = 0; i<array.length;i++){
			if (array[i].getSueldo() >max){
				max = array[i].getSueldo() ;
				empleado = array[i].getNombre() + " " + array[i].getApellidos();
			}
			if (array[i].getSueldo() <min){
				min = array[i].getSueldo() ;
			}
			//suma = suma + arrayNums[i];
			suma += array[i].getSueldo() ;
		}
		
		return empleado;	
			
		}
	
	public static String maximoFacturacion(Empresa[] array){
//		double max = Double.MIN_VALUE;
//		double min = Double.MAX_VALUE;
//		int suma =0;
//		Empresa[] facturacion= new Empresa[3];
//		
//		
//		
		return "";	
			
		}
	public static void encimaMedia(Empleado[] array){
		int suma =0;
		
		for (int i = 0; i<array.length;i++){
			suma += array[i].getSueldo() ;
		}
		float media = suma/array.length;
		System.out.println("Empleados por encima de la media " + media );
		for (int i = 0; i<array.length;i++){
			if (array[i].getSueldo() >=media){
				System.out.println(array[i].toString());
			}
		}
			
		}
	public static void main(String[] args) {
		//Persona[] arrayPersona = new Persona[3];
		Empleado[] arrayEmpleado = new Empleado[3];
		Cliente[] arrayCliente = new Cliente[3];
		Empresa[] arrayEmpresa= new Empresa[3];
		//Crei Empleados
		Empleado emp1 = new Empleado("Luis", "Perez", "16014502W", "Plaza", "Informatica", 25000);
		arrayEmpleado[0]= emp1;
		Empleado emp2 = new Empleado("Ana", "Garcia", "15874502W", "Muro", "Recursos", 50000);
		arrayEmpleado[1]= emp2;
		Empleado emp3 = new Empleado("Maria", "Martinez", "58914502W", "La vida", "Recursos", 40000);
		arrayEmpleado[2]= emp3;
		
		//creo Empresas
		Empresa empresa1 = new Empresa("CCC", "12345678", "la vida", 254789);
		arrayEmpresa[0]= empresa1;
		Empresa empresa2 = new Empresa("AAAA", "98745612", "Alegria", 254789);
		arrayEmpresa[0]= empresa1;
		
		//creo Cliente
		Cliente cliente1 = new Cliente("Cliente1", "Perez", "16014502W", "9877777", empresa1);
		arrayCliente[0] = cliente1;
		Cliente cliente2 = new Cliente("Cliente1", "Perez", "16014502W", "9877777", empresa2);
		arrayCliente[0] = cliente2;
		
		
		System.out.println("El empleado de mayor sueldo es " + maximoSueldo(arrayEmpleado));
		encimaMedia(arrayEmpleado);
		
		
		for (int i=0; i<3; i++){
			
		}
	}

}
