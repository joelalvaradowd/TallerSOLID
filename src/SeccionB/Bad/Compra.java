package SeccionB.Bad;
import java.util.List;

public class Compra {
	private Pago pago;
	private PagoPayPal pagoPayPal;
	private List<?> articulos;
	public Compra (Pago pago) {
		//Inicializaciones
	}
	public Compra (PagoPayPal pagoaypal) {
		//Inicializaciones
	}
	public void agregarArticulo(Articulo articulo) {
		//agregar un articulo a la compra
	}
	public void removerArticulo(Articulo articulo) {
		//remover un articulo a la compra
	}
	public List<?> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<?> articulos) {
		this.articulos = articulos;
	}
	public PagoPayPal getpagoPayPal() {
		return pagoPayPal;
	}
	public void setpagoPayPal(PagoPayPal pagoPayPal) {
		this.pagoPayPal = pagoPayPal;
	}
	public Pago getPago() {
		return pago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
}
