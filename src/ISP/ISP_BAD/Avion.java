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
		System.out.println("Un avión está volando");
	}
	
	@Override
	public void respirar() {
		//Método vacío
	}
	
	@Override
	public void comer() {
		//Método vacío
	}
	
	@Override
	public void encender() {
		System.out.println("Un avión está encendiendo");
	}
}
