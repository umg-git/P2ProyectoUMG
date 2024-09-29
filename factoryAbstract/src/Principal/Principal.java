package Principal;


import java.util.Scanner;

import Fabricas.FabricaBuses;
import Fabricas.FabricaBusetas;
import Fabricas.FabricaDeVehiculos;
import Fabricas.FabricaTaxis;

public class Principal {

	private static void mensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FabricaBusetas busetas=new FabricaBusetas();
		FabricaTaxis taxi=new FabricaTaxis();
		FabricaBuses buses=new FabricaBuses();
		String mensaje = "",salida;
		mensaje+="Ingrese la opci�n correspondiente para obtener \nel codigo del servicio\n\n";
		mensaje+="1. Codigo servicio de Taxis\n";
		mensaje+="2. Codigo servicio de Buses\n";
		mensaje+="3. Codigo servicio de Busetas\n\n";
		try {
			do {
				try 
				{
					int opcion=sc.nextInt();
					
					switch (opcion)
					{
					case 1: FabricaDeVehiculos.crearFabricaDeVehiculo(taxi);
						break;
					case 2: FabricaDeVehiculos.crearFabricaDeVehiculo(buses);
						break;
					case 3: FabricaDeVehiculos.crearFabricaDeVehiculo(busetas);
						break;
					default: mensaje = "No es un valor de consulta valido";
						break;
						}
				} catch (Exception e) {
						mensaje = "No es un parametro de consulta valido";
					}
				mensaje = "Desea consultar otro codigo? S/N";
			salida=sc.next();
			
			} while (salida.toUpperCase().equals("S"));
		} catch (Exception e) {
			mensaje = "Bye!!!";
		}
		
		
	}

}
