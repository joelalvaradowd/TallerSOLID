package ISP.ISP_GOOD;

public class Pajaro implements Accion, AccionPajaro{
	private String tipo;
	private String color;
	
	public Pajaro(String tipo, String color) {
		this.tipo = tipo;
		this.color = color;
	}
	
	@Override
	public void volar() {
		System.out.println("Un pajaro est� volando");
	}
	@Override
	public void respirar() {
		System.out.println("Un pajaro est� respirando");
	}
	@Override
	public void comer() {
		System.out.println("Un pajara est� comiendo");
	}
}
