
public class Principal {

	public static void main(String[] args) {
		Farola farola1 = new Farola("farola2", 1, 0, 2.25, 3);
		System.out.println("Farola:" + farola1.getNombre() + " tiene " + farola1.getNum_luminarias() + " luminarias");
		System.out.println("Posicion:" + farola1.str_posicion(farola1.set_posicion()) );
		
		Farola farola2 = new Farola();
		System.out.println("Farola:" + farola2.getNombre() + " tiene " + farola2.getNum_luminarias() + " luminarias");
		System.out.println("Posicion:" + farola2.str_posicion(farola2.set_posicion()) );
		
		Farola farola3 = new Farola("farola 3");
		System.out.println("Farola:" + farola3.getNombre() + " tiene " + farola3.getNum_luminarias() + " luminarias");
		System.out.println("Posicion:" + farola3.str_posicion(farola3.set_posicion()) );
		
		Farola farola4 = new Farola("farola 4", 5,1);
		System.out.println("Farola:" + farola4.getNombre() + " tiene " + farola4.getNum_luminarias() + " luminarias" + " y " + farola4.getNum_camaras() + " camaras");

	}

}
