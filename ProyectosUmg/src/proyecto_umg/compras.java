
//**************************************************************
//Clase de compra de articulos del extranjero o materia prima
//**************************************************************

package proyecto_umg;

public class compras {
	private int numeroCompra = 0;
	private String fecha = "";
	
	
	public compras(int numeroCompra, String fecha) {
		super();
		this.numeroCompra = numeroCompra;
		this.fecha = fecha;
	}


	public int getNumeroCompra() {
		return numeroCompra;
	}


	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		
	
	
	
}
