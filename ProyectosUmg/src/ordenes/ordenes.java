package ordenes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ordenes {
	
	public static void registrarOrden() {
		Scanner sc = new Scanner(System.in);
		String numero, cliente, telefono, producto, cantidad, estado;
		String archivoJSON = "src\\files\\ordenes.json";
		try {
	        
	        // Leer el archivo json existente como un string
	        String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

	        // Convierte el string a un objeto json
	        JSONObject objetoJSON = new JSONObject(contenido);

	        // Obtiene el arreglo de camisas
	        JSONArray items = objetoJSON.getJSONArray("ordenes");

	        //Solicitamos los datos del producto
	        System.out.println("Ingrese el numero de orden");
	        numero = sc.nextLine();
	        System.out.println("Ingrese el cliente.");
	        cliente = sc.nextLine();
	        System.out.println("Ingrese el telefono del cliente.");
	        telefono = sc.nextLine();
	        System.out.println("Ingrese el producto ordenado(camisa, sueter).");
	        producto = sc.nextLine();	 
	        System.out.println("Ingrese cantidad.");
	        cantidad = sc.nextLine();
	        
	        // Crea un nuevo registro para agregar al arreglo
	        JSONObject nuevoRegistro = new JSONObject();
	        nuevoRegistro.put("noOrden", numero);
	        nuevoRegistro.put("cliente", cliente);
	        nuevoRegistro.put("telefono", telefono);
	        nuevoRegistro.put("productoOrdenado", producto);
	        nuevoRegistro.put("cantidad", cantidad);

	        // Agrega el nuevo item al arreglo
	        items.put(nuevoRegistro);

	        // Actualiza el json original con los nuevos datos
	        objetoJSON.put("ordenes", items);

	        // Escribe el nuevo json en el archivo (sobrescribiendo el archivo anterior)
	        Files.write(Paths.get(archivoJSON), objetoJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);

	        System.out.println("Nuevo registro agregado correctamente.");
	        registroFactura(numero,cliente,telefono,producto, cantidad);
	        estadoOrden(numero );
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void registroFactura(String noOrden, String c, String t, String p, String can) {
		Date fecha = new Date();
		String archivoJSON = "src\\files\\facturas.json";
		try {
	        
	        String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));
	        JSONObject objetoJSON = new JSONObject(contenido);

	        JSONArray items = objetoJSON.getJSONArray("facturas");

	        // Crea un nuevo registro para agregar al arreglo
	        JSONObject nuevoRegistro = new JSONObject();
	        nuevoRegistro.put("noFactura", noOrden);
	        nuevoRegistro.put("fecha", fecha);
	        nuevoRegistro.put("cliente", c);
	        nuevoRegistro.put("telefono", t);
	        nuevoRegistro.put("productoOrdenado", p);
	        nuevoRegistro.put("cantidadProducto", can);
	        nuevoRegistro.put("totalPrecio", noOrden);

	        // Agrega el nuevo item al arreglo
	        items.put(nuevoRegistro);

	        // Actualiza el json original con los nuevos datos
	        objetoJSON.put("facturas", items);

	        // Escribe el nuevo json en el archivo (sobrescribiendo el archivo anterior)
	        Files.write(Paths.get(archivoJSON), objetoJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
	        
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void estadoOrden(String noOrden) {
		String archivoJSON = "src\\files\\estadoOrdenes.json";
		try {
	        
	        String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));
	        JSONObject objetoJSON = new JSONObject(contenido);

	        JSONArray items = objetoJSON.getJSONArray("estadoOrdenes");

	        // Crea un nuevo registro para agregar al arreglo
	        JSONObject nuevoRegistro = new JSONObject();
	        nuevoRegistro.put("noOrden", noOrden);
	        nuevoRegistro.put("estado", "activo");

	        // Agrega el nuevo item al arreglo
	        items.put(nuevoRegistro);

	        // Actualiza el json original con los nuevos datos
	        objetoJSON.put("estadoOrdenes", items);

	        // Escribe el nuevo json en el archivo (sobrescribiendo el archivo anterior)
	        Files.write(Paths.get(archivoJSON), objetoJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
	        
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}

