package OCP.OPC_GOOD;

public class Motocicleta implements MedioTransporte {
	private String matricula;
	private int numeroLlantas;
	
	
	
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getNumeroLlantas() {
		return numeroLlantas;
	}



	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}



	@Override
	public String ensamblar() {
		return "Se esta ensamblando una Motocicleta";
	}

}
