package BuenUso;

public class Scooter implements MedioTransporte {
	
	private Boolean presenciaManubrio;
	private String modelo;
	
	@Override
	public String ensamblar() {
		return "Se encuentra armando un Scooter del modelo " + modelo; 
	}

}
