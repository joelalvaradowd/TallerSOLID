package OCP.OPC_GOOD;

public class Trailer implements MedioTransporte{
	private String matricula;
	private int numeroPuertas;
	private int numeroAsientos;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	@Override
	public String ensamblar() {
		return "Se encuentra ensamblando un auto con "+ numeroPuertas+ "puertas";
	}

}
