package Fabricas;

import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;


public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory)
	{
		/**Aplicamos Polimorfismo*/
		Vehiculo objetoVehiculo= factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
