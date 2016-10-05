package JugadorSeleccionBuilder;
	

public class JugadorSeleccionBuilder {
	private  int dorsal;
	private final String nombre;
	private  String demarcacion;

	public static class Builder{
		//parametros requeridos
		private final String nombre;
		//parametros opcionales
		private int dorsal=100;
		private String demarcacion = "sin determinar";
		
		public Builder(String nombre){
			this.nombre= nombre;
		}
		
		public Builder dorsal(Integer dorsal){
			this.dorsal = dorsal;
			return this;
		}
		public Builder demarcacion(String demarcacion){
			this.demarcacion = demarcacion;
			return this;
		}
		public JugadorSeleccionBuilder build(){
			return new JugadorSeleccionBuilder(this);
		}
	}
	
	
	public  JugadorSeleccionBuilder(Builder builder){
		this.dorsal = builder.dorsal;
		this.demarcacion= builder.demarcacion;
		this.nombre = builder.nombre;
		
	}
	

	@Override
	public String toString() {
		return "JugadorSeleccionBuilder [dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + "]";
	}


	public int getDorsal() {
		return dorsal;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDemarcacion() {
		return demarcacion;
	}
	
}
