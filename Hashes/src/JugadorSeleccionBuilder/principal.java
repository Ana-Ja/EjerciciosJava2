package JugadorSeleccionBuilder;

public class principal {

	public static void main(String[] args) {
		JugadorSeleccionBuilder Jugador1= new JugadorSeleccionBuilder.Builder("Jugador1").build();
		System.out.println(Jugador1.toString());
		JugadorSeleccionBuilder Jugador2= new JugadorSeleccionBuilder.Builder("Jugador2").demarcacion("Portero").build();
		System.out.println(Jugador2.toString());
	}

}
