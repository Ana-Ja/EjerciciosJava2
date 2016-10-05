import java.util.Random;


public class EjercicioRandom {

	public static void main(String[] args) {
		//creamos un objeto tipo Random
		Random rand = new Random();
		//el método nextInt() del objeto Random creado (se invoca
		//como rand.nextInt()) genera un número aleatorio entero positio y negativo.
		//me devuleve un entero muy grande, si lo quiero entre 0 y 100,
		//saco el resto de dividirlo entre 100
		int i= rand.nextInt()%100;
		prt("i=" + i);
		int x = rand.nextInt(50);
		prt("x=" + x);
		//Otra forma es usar la libreria Math que devuelve un double y positivo entre 0 y 1
		double  j= Math.random();
		prt("j=" + j);
		//si quiero que sea un entero entre 0 y 9 hago un cast y multiplico por 10
		int  K= (int)(Math.random()*10);
		prt("K=" + K);
		//si quiero que sea un entero entre 1 y 10 hago un cast y multiplico por 10
		int  a= (int)(Math.random()*10+1);
		prt("a=" + a);
		//si quiero que sea un entero entre 1 y 100 hago un cast y multiplico por 100
		int  b= (int)(Math.random()*100+1);
		prt("b=" + b);
		
	}
	static void prt(String s) {
		System.out.println(s);
	}
}
