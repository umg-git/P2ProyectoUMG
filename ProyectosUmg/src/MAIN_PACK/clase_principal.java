
package MAIN_PACK;
import MAIN_PACK.menu;
import ordenes.ordenes;
import proyecto_umg.cliente;
import proyecto_umg.compras;
import proyecto_umg.facturacion;
import proyecto_umg.producto;
import proyecto_umg.ventas;

import java.util.Scanner;
import factory.abstractFactory;
import factory.concreteFactory;
import Interface.IGeneral;
import Interface.IConsulta;
import Interface.IFactura;
import Interface.IEstado;
import JSON.json;
public class clase_principal {

	private static void mensaje(String cadena) {
		System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ordenes o = new ordenes();
		
		int op = 0;
        abstractFactory fabrica = new concreteFactory();
        
        
        mensaje("1. Realizar orden.");
        mensaje("2. Facturacion.");
        mensaje("3. opciones productos.");
        mensaje("4. Consultar ordenes.");
        mensaje("5. Consulta estados.");
        mensaje("Seleccione una opción.");
        op = sc.nextInt();
        
        switch(op){
        case 1:
        	o.registrarOrden();
        	break;
        case 2:
        	IFactura f = fabrica.Factura(1);
        	f.factura();
        	break;
        case 3:
        	IGeneral obj = fabrica.peticion(1);
        	obj.Peticion();
        	break;
        case 4:
        	IConsulta c = fabrica.Consultar(1);
        	c.consultar();
        	break;
        case 5:
        	IEstado e = fabrica.Estado(1);
        	e.estado();
        	break;
        }
        
        //IProducto producto2 = fabrica.crearProducto("sueteres");

        //producto1.Producir();
        //producto2.Producir();		

	}

}
