package Clases;
import Interfaces.Vehiculo;


public class Bus implements Vehiculo{
	
	private int codigo;
	
	public int generarCodigo()
	{
		int codigoBus=(int) (Math.random()*9999);
		return codigoBus;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void codigoDeVehiculo() {
		System.out.println("El Codigo del Bus es : "+getCodigo());
	}
	
	

}
