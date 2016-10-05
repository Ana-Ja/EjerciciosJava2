import java.util.ArrayList;
import java.util.Iterator;


public final class Grupo {
    private ArrayList<Farola> grupo= new ArrayList<Farola>();;
	public Grupo(String consulta, int num_farolas) {
		this.grupo = creaGrupo( consulta,  num_farolas);
	}
	public  ArrayList<Farola> creaGrupo(String consulta, int num_farolas){
		//  ArrayList<Farola> rdo= new ArrayList<Farola>();
		  //realizo consulta y devuelve num_farolas farolas
		  for ( int i=1; i<num_farolas;i++){
			  
			  grupo.add( new Farola.Builder("luminosa" + i).camaras(i).posicion(i*10, i*20).build());
		  }
		  return grupo;
	  }
	
	public void visualizar() {
		Iterator<Farola> iterador = this.grupo.iterator();
	    while (iterador.hasNext()){
	    	
	    	Farola farola_grupo = iterador.next();
	    	System.out.println(farola_grupo.toString());
	    }

	}

	public void encender() {
		//ArrayList<Farola> rdo= new ArrayList<Farola>();
		Iterator<Farola> iterador = this.grupo.iterator();
	    while (iterador.hasNext()){
	    	
	    	Farola farola = iterador.next();
	    	farola.setEncendida(true);
	    }

	}


	public void apagar() {
		//ArrayList<Farola> rdo= new ArrayList<Farola>();
		Iterator<Farola> iterador = this.grupo.iterator();
	    while (iterador.hasNext()){
	    	
	    	Farola farola = iterador.next();
	    	farola.setEncendida(false);
	    }

	}

	

}
