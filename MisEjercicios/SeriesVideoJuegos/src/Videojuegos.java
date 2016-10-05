
public class Videojuegos implements Entregable {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public Videojuegos() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}
	
	public Videojuegos(String titulo, int horas){
		this();
		this.titulo = titulo;
		this.horasEstimadas = horas;
	}
	
	public Videojuegos(String titulo, int horasEstimadas, String genero,
			String compania) {
		this();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	@Override
	public void entregar() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
				
		Videojuegos comp = (Videojuegos)a;
		
		if (this.horasEstimadas==comp.horasEstimadas){
			return 0;
		}else if (this.horasEstimadas>comp.horasEstimadas){
			return 1;
		}else{
			return -1;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

}
