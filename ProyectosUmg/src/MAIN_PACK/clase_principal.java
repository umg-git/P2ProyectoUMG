
package MAIN_PACK;
import MAIN_PACK.menu;
import proyecto_umg.cliente;
import proyecto_umg.compras;
import proyecto_umg.facturacion;
import proyecto_umg.producto;
import proyecto_umg.ventas;

import java.util.Scanner;


public class clase_principal {

	private static void mensaje(String cadena) {
		System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mensaje("Bienvenido al Sistema de Control de Proceso(SCP).");
		int op = 0;
		menu m = new menu();
		m.Menu();



		mensaje("4. Producto.");
		mensaje("5. Facturación.");
		mensaje("6. unknown");
		mensaje("7. unknown");
		
		switch(op) {
		case 1:
			String fechaVenta = "";
			int numeroVenta = 0;
			ventas venta = new ventas(fechaVenta,numeroVenta );
			mensaje("Ingrese datos.");
			
			mensaje("Fecha: ");
			venta.setFechaVenta(sc.next(fechaVenta));
			
			mensaje("Numero de venta: ");
			venta.setNumeroVenta(sc.nextInt(numeroVenta));
			
			mensaje(venta.getFechaVenta());
			mensaje("" + venta.getNumeroVenta() );
			break;
			
		case 2:
			int numeroCompra = 0;
			String fecha = "";
			
			compras compra = new compras(numeroCompra,fecha );
			mensaje("Ingrese datos.");
			
			mensaje("Numero compra: ");
			compra.setNumeroCompra(sc.nextInt(numeroCompra));
			
			mensaje("Fecha: ");
			compra.setFecha(sc.next(fecha));
			
			mensaje("" + compra.getNumeroCompra());
			mensaje(compra.getFecha() );
			break;
		case 3:
			String nombre = "";
			String apellido = "";
			String nit = "";
			String telefono = "";
			cliente cliente = new cliente(nombre, apellido, nit, telefono);
			mensaje("Ingrese datos.");
			
			mensaje("Nombre cliente: ");
			cliente.set_nombre(sc.next(nombre));
			mensaje("Apellido cliente: ");
			cliente.set_nombre(sc.next(apellido));
			mensaje("Nit cliente: ");
			cliente.set_nombre(sc.next(nit));
			mensaje("Telefono cliente: ");
			cliente.set_nombre(sc.next(telefono));
				
			mensaje(cliente.get_nombre());
			mensaje(cliente.get_apellido());
			mensaje(cliente.get_nit());
			mensaje(cliente.get_telefono());
			
			
			break;
		case 4:
			String codigo = "";
			String producto = "";
			String precio = "";
			String estado = "";
			
			producto productos = new producto(codigo, producto, precio, estado);
			mensaje("Ingrese datos.");
			
			mensaje("Código: ");
			productos.set_codigo(sc.next(codigo));
			mensaje("Producto: ");
			productos.set_nombre(sc.next(producto));
			mensaje("Precio: ");
			productos.set_precio(sc.next(precio));
			mensaje("Estdo: ");
			productos.set_estado(sc.next(estado));
				
			mensaje(productos.get_codigo());
			mensaje(productos.get_nombre());
			mensaje(productos.get_precio());
			mensaje(productos.get_estado());
			break;
		case 5:
			int numeroFactura = 0;
			String f_fecha = "";
			String f_cliente = "";
			String f_producto = "";
			
			facturacion factu = new facturacion(numeroFactura, f_fecha, f_cliente, f_producto);
			mensaje("Ingrese datos.");
			
			mensaje("Factura: ");
			factu.setNumeroFactura(sc.nextInt(numeroFactura));
			mensaje("Fecha: ");
			factu.setFecha(sc.next(f_fecha));
			mensaje("Precio: ");
			factu.setCliente(sc.next(f_cliente));
			mensaje("Estdo: ");
			factu.setProducto(sc.next(f_producto));
				
			mensaje("" + factu.getNumeroFactura());
			mensaje(factu.getFecha());
			mensaje(factu.getCliente());
			mensaje(factu.getProducto());
			break;
		}
		

	}

}
