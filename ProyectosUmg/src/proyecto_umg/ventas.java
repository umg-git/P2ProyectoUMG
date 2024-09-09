
//**************************************************************
//Clase para ventas a los clientes de la empresa
//**************************************************************

package proyecto_umg;

public class ventas {
	private String fechaVenta = "";
	private int numeroVenta = 0;
	
	public ventas(String fechaVenta, int numeroVenta) {
		super();
		this.fechaVenta = fechaVenta;
		this.numeroVenta = numeroVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	
	
}
