import java.util.ArrayList;
import java.util.Iterator;


public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
		ArrayList<String> nombreArrayList2 = new ArrayList<String>();
		nombreArrayList2.add("Elemento");   // Añade el elemento al ArrayList
		nombreArrayList2.add(0, "Elemento 2");   // Añade el elemento al ArrayList en la posición 'n'
		nombreArrayList2.size();   // Devuelve el numero de elementos del ArrayList
		nombreArrayList2.get(1);   // Devuelve el elemento que esta en la posición '2' del ArrayList
		nombreArrayList2.contains("Elemento");   // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
		nombreArrayList2.indexOf("Elemento");   // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList 
		nombreArrayList2.lastIndexOf("Elemento");   // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
		nombreArrayList2.remove(1);   // Borra el elemento de la posición '5' del ArrayList
		nombreArrayList2.remove("Elemento");   // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
		nombreArrayList2.clear();   //Borra todos los elementos de ArrayList
		nombreArrayList2.isEmpty();   // Devuelve True si el ArrayList esta vacio. Sino Devuelve False
		ArrayList arrayListCopia = (ArrayList) nombreArrayList2.clone();   // Copiar un ArrayList
		Object[] array = nombreArrayList2.toArray();   // Pasa el ArrayList a un Array

		// Declaración el ArrayList
		ArrayList<String> nombreArrayList = new ArrayList<String>();

		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			nombreArrayList.add("Elemento "+i); 
		}

		// Añadimos un nuevo elemento al ArrayList en la posición 2
		nombreArrayList.add(2, "Elemento 3");

		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}
		
		// Recordar que previamente ya hemos declarado el ArrayList y el Iterator de la siguiente forma:
		// ArrayList<String> nombreArrayList = new ArrayList<String>();
		// Iterator<String> nombreIterator = nombreArrayList.iterator();

		// Obtenemos el numero de elementos del ArrayList
		int numElementos = nombreArrayList.size();
		System.out.println("nnEl ArrayList tiene "+numElementos+" elementos");

		// Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
		System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
		nombreArrayList.remove(0);

		// Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
		System.out.println("n... Eliminamos los elementos de ArrayList que sean iguales a 'Elemento 3' ...");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			if(elemento.equals("Elemento 3"))
				nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
		}

		// Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
		System.out.println("nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}

		// Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
		numElementos = nombreArrayList.size();
		System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
	}

}
