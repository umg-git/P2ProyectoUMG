
//**************************************************************
//Clase para facturacion de una compra de articulo o solicitud. 
//**************************************************************

package proyecto_umg;
import proyecto_umg.cliente;

public class facturacion {
	private int numeroFactura = 0;
	private String fecha = "";
	private String cliente = "";
	private String producto = "";
	
	public facturacion(int numeroFactura, String fecha, String cliente, String producto) {
		super();
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.cliente = cliente;
		this.producto = producto;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	
	
	
}
