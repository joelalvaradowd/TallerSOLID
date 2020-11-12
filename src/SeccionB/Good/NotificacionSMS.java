package SeccionB.Good;

public class NotificacionSMS extends Notificacion implements INotificar {
	//atributos

	public NotificacionSMS(TipoNotificacion tipoNotificacion) {
		super(tipoNotificacion);

	}

	@Override
	public void notificar(Pago pago) {
		
	}
}
