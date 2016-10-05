
public class ExcepcionPersonalizada extends Exception {
	
	public ExcepcionPersonalizada(){
		super("el número debe ser positivo");
	}
	
	public ExcepcionPersonalizada(String mensaje){
		super(mensaje);
	}
	
}
