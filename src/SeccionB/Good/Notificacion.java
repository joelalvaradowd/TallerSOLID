package SeccionB.Good;


public class Notificacion implements INotificar {
	private TipoNotificacion tipoNotificacion;

	public Notificacion(TipoNotificacion tipoNotificacion) {
		this.setTipoNotificacion(tipoNotificacion);
	}

	public TipoNotificacion getTipoNotificacion() {
		return tipoNotificacion;
	}

	public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}

	@Override
	public void notificar(Pago pago) {
		// TODO Auto-generated method stub
		
	}
}
