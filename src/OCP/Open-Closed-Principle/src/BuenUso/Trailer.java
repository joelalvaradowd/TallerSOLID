package BuenUso;

public class Trailer implements MedioTransporte{
	private String matricula;
	private int numeroPuertas;
	private int numeroAsientos;
	
	@Override
	public String ensamblar() {
		return "Se encuentra ensamblando un auto con "+ numeroPuertas+ "puertas";
	}

}
