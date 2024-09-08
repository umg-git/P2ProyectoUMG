package Fabricas;
import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;


import Clases.Buseta;



public class FabricaBusetas implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Buseta miBuseta=new Buseta();
		miBuseta.setCodigo(miBuseta.generarCodigo());
		System.out.println("Se ha creado un nuevo Objeto Buseta  ");
		return miBuseta;
	}



}
