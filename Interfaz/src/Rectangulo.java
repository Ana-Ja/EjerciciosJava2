
public class Rectangulo implements Figuras {
	private float lado1;
	private float lado2;
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	public Rectangulo ( float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return this.lado1 *this.lado2;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.lado1)*2 * (this.lado2)*2;
	}

	@Override
	public String tipoFigura() {
		// TODO Auto-generated method stub
		return "soy rectangulo";
	}

}
