
public class Farola {
	private String nombre;
	private int num_luminarias;
	private int num_camaras;
	private double pos_x;
	private double pos_y;
	private double [] posicion;
	public Farola(){
		this.nombre="";
		this.num_luminarias = 1;
		this.num_camaras = 0;
		this.pos_x = 0;
		this.pos_y = 0;
	}
	
	public Farola(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Farola(String nombre, int num_camaras) {
		super();
		this.nombre = nombre;
		this.num_camaras = num_camaras;
	}


	public Farola(String nombre, int num_luminarias, int num_camaras,
			double pos_x, double pos_y) {
		super();
		this.nombre = nombre;
		this.num_luminarias = num_luminarias;
		this.num_camaras = num_camaras;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
	}
	
	public Farola(String nombre, int num_luminarias, int num_camaras) {
		super();
		this.nombre = nombre;
		this.num_luminarias = num_luminarias;
		this.num_camaras = num_camaras;
		this.pos_x = 0;
		this.pos_y = 0;
	}
	
	public double[]  set_posicion(){
		posicion = new double[2];
		posicion[0]= this.pos_x;
		posicion[1]= this.pos_y;
		return posicion;
	}
	
	public String str_posicion(double[] posicion){
		return "[" + posicion[0] + "," + posicion[1] + "]";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNum_luminarias() {
		return num_luminarias;
	}
	
	public int getNum_camaras() {
		return num_camaras;
	}
	
	public double getPos_x() {
		return pos_x;
	}
	
	public double getPos_y() {
		return pos_y;
	}
	
	
}
