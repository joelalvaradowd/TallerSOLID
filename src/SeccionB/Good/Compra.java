package SeccionB.Good;



public class Compra {
	private Pago pago;
	private PagoPayPal pagoPayPal;
	private ListaArticulos articulos;
	public Compra (Pago pago) {
		//Inicializaciones
	}
	public Compra (PagoPayPal pagoPaypal) {
		//Inicializaciones
	}
	public Pago getPago() {
		return pago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
	public PagoPayPal getPagoPayPal() {
		return pagoPayPal;
	}
	public void setPagopPayPal(PagoPayPal pagoPayPal) {
		this.pagoPayPal = pagoPayPal;
	}
	public ListaArticulos getArticulos() {
		return articulos;
	}
	public void setArticulos(ListaArticulos articulos) {
		this.articulos = articulos;
	}
	
	
	
}
