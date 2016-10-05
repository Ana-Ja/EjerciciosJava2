public class Farola {
  
  private final String nombre;
  private final int luminarias;
  private final int camaras;
  private final double x, y;
  private final boolean posicion;

  public Farola(String nombre) {
    this(nombre, 1, 0, false, 0.0, 0.0);
  }

  public Farola(String nombre, int luminarias) {
    this(nombre, luminarias, 0, false, 0.0, 0.0);
  }

  public Farola(String nombre, int luminarias, int camaras) {
    this(nombre, luminarias, camaras, false, 0.0, 0.0);
  }

  public Farola(String nombre, int luminarias, int camaras, double x, double y) {
    this(nombre, luminarias, camaras, true, x, y);
  }

  public Farola(String nombre, int luminarias, int camaras, boolean con_posicion, double x, double y) {
    this.nombre     = nombre;
    this.luminarias = luminarias;
    this.camaras    = camaras;
    this.posicion   = con_posicion;
    this.x          = x;
    this.y          = y;
  }

  public String get_nombre() {
    return this.nombre;
  }

  public int get_luminarias() {
    return this.luminarias;
  }

  public int get_camaras() {
    return this.camaras;
  }

  public boolean tiene_posicion() {
    return this.posicion;
  }

  public double get_x() {
    return this.x;
  }

  public double get_y() {
    return this.y;
  }

  public double[] get_posicion() {
    return new double[]{this.x, this.y};
  }

}
