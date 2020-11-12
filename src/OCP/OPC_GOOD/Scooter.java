package OCP.OPC_GOOD;

public class Scooter implements MedioTransporte {
	
	private Boolean presenciaManubrio;
	private String modelo;
	
	public Boolean getPresenciaManubrio() {
		return presenciaManubrio;
	}

	public void setPresenciaManubrio(Boolean presenciaManubrio) {
		this.presenciaManubrio = presenciaManubrio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String ensamblar() {
		return "Se encuentra armando un Scooter del modelo " + modelo; 
	}

}
