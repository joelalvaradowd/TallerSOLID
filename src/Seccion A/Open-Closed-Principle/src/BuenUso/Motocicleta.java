package BuenUso;

public class Motocicleta implements MedioTransporte {
	private String matricula;
	private int numeroLlantas;
	
	
	
	@Override
	public String ensamblar() {
		return "Se esta ensamblando una Motocicleta";
	}

}
