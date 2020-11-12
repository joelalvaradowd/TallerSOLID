package ISP.ISP_GOOD;

public class Avion implements Accion, AccionAvion {
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
	public void encender() {
		System.out.println("Un avión está encendiendo");
	}
}
