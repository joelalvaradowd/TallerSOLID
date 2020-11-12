import java.util.List;

public class Compra {
	private Pago pago;
	private PagoPayPal pagopPayPal;
	private List articulos;
	public Compra (Pago pago) {
		//Inicializaciones
	}
	public Compra (PagoPayPal pagoPaypal) {
		//Inicializaciones
	}
	public void agregarArticulo(Articulo articulo) {
		//agregar un articulo a la compra
	}
	public void removerArticulo(Articulo articulo) {
		//remover un articulo a la compra
	}
}
