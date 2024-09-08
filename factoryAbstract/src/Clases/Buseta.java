package Clases;
import Interfaces.Vehiculo;


public class Buseta implements Vehiculo{
	
	private int codigo;
	
	public int generarCodigo()
	{
		int codigoBuseta=(int) (Math.random()*9999);
		return codigoBuseta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		System.out.println("El Codigo de la Buseta es : "+getCodigo());
	}

}

