
public class Persona {
	//declaracion de atributos
	public String nombre;
	public String apellidos;
	public int edad;
	
	
	public Persona(){
		this.nombre= "";
		this.apellidos = "";
		this.edad = 22;
	}
	public Persona( String nombre, String apellidos, int edad) {
		this.nombre= nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
