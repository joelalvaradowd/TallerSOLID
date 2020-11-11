package PaqueteSeccionB;


public class Notificacion {
	private tiposNotificacion tipoNotificacion;
	
	public void notificar(Pago pago) {
		tipoNotificacion.generarNotificacion();
	}
}
