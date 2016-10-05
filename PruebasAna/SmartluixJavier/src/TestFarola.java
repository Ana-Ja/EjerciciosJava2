

public class TestFarola {
  public static void main(String[] args)
  {
    Farola farola = new Farola("luminosa", 3, 0, 111.0, 222.0);
    System.out.format("Farola: %s - %d (%d)\n", farola.get_nombre(), farola.get_luminarias(), farola.get_camaras());
    if (farola.tiene_posicion()) {
      System.out.format(" X: %g Y: %g\n", farola.get_x(), farola.get_y());
    }
  }

}
