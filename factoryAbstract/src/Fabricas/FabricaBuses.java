package Fabricas;
import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;


import Clases.Bus;


public class FabricaBuses implements VehiculoDeTransporte{
	
	public Vehiculo crearVehiculo() {

		Bus miBus=new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		System.out.println("Se ha creado un nuevo Objeto Bus  ");
		return miBus;
	}

}
