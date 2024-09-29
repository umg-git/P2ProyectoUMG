
package MAIN_PACK;
import MAIN_PACK.menu;
import proyecto_umg.cliente;
import proyecto_umg.compras;
import proyecto_umg.facturacion;
import proyecto_umg.producto;
import proyecto_umg.ventas;

import java.util.Scanner;
import factory.abstractFactory;
import factory.concreteFactory;
import Interface.IProducto;
import JSON.json;
public class clase_principal {

	private static void mensaje(String cadena) {
		System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        abstractFactory fabrica = new concreteFactory();
        
        //Instancia a la clase menu
        menu m = new menu();
        m.Menu();
        
        IProducto producto1 = fabrica.crearProducto("camisas");
        //IProducto producto2 = fabrica.crearProducto("sueteres");

        producto1.Producir();
        //producto2.Producir();		

	}

}
