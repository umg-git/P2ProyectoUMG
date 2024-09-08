package Clases;
import Interfaces.Vehiculo;


public class Taxi implements Vehiculo{
	
	private int codigo;
	
	public int generarCodigo()
	{
		int codigoTaxi=(int) (Math.random()*9999);
		return codigoTaxi;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		System.out.println("El Codigo del Taxi es : "+getCodigo());
	
	}

}
