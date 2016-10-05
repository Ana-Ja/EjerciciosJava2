import java.util.ArrayList;
import java.util.Iterator;

/*
  javac Farola.java
  javac TestFarola.java
  java TestFarola
*/

public class TestFarola {


  public static void main(String[] args)
  {
//    Farola farola = new Farola.Builder("luminosa").luminarias(3).posicion(111.0, 222.0).build();
    Farola farola = new Farola.Builder("luminosa").camaras(5).posicion(111.0, 444.0).build();
    System.out.format("Farola: %s - %d (%d)\n", farola.get_nombre(), farola.get_luminarias(), farola.get_camaras());
    if (farola.tiene_posicion()) {
      System.out.format(" X: %g Y: %g\n", farola.get_x(), farola.get_y());
    }
    
    Grupo grupo1 = new Grupo("consulta",10);
    grupo1.visualizar();
    grupo1.encender();
    grupo1.visualizar();
    grupo1.apagar();
    grupo1.visualizar();
    
 
    
    //creo grupo de10 farolas
//    ArrayList<Farola> grupo1= new ArrayList<Farola>();
//    grupo1 = Farola.grupo("consulta",10);
   // ArrayList<Farola> grupo1= Grupo.creaGrupo("consulta",10);
    
   // grupo1.encender(grupo1);
//    Iterator<Farola> iterador = grupo.iterator();
//    while (iterador.hasNext()){
//    	
//    	Farola farola_grupo = iterador.next();
//    	System.out.println(farola_grupo.toString());
//    }
  }

}
