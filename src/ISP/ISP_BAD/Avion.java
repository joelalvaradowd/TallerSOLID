package ISP.ISP_BAD;

public class Avion implements Accion{
	private String modelo;
	private int capacidad;
	
	public Avion (String modelo, int capacidad) {
		this.modelo = modelo;
		this.capacidad = capacidad;
	}
	
	@Override
	public void volar() {
		System.out.println("Un avi�n est� volando");
	}
	
	@Override
	public void respirar() {
		//M�todo vac�o
	}
	
	@Override
	public void comer() {
		//M�todo vac�o
	}
	
	@Override
	public void encender() {
		System.out.println("Un avi�n est� encendiendo");
	}
}
