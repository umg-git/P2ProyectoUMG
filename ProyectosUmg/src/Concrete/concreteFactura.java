package Concrete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import Interface.IFactura;
import Interface.IGeneral;

public class concreteFactura implements  IFactura {

	@Override
	public void factura() {
		//ruta relativa
		String archivoJSON = "src\\files\\facturas.json";
		try {
	        // Lee el archivo json
            String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

            // Convertie el String a un objeto json
            JSONObject objetoJSON = new JSONObject(contenido);

            // Obtiene el arreglo de platos fuertes
            JSONArray item = objetoJSON.getJSONArray("facturas");
            
            // Recorre cada elemento del arreglo
            for (int i = 0; i < item.length(); i++) {
                JSONObject obj = item.getJSONObject(i);

                // Extrae los valores del 
                String no = obj.getString("noFactura");
                String fecha = obj.getString("fecha");
                String cliente = obj.getString("cliente");
                String telefono = obj.getString("telefono");
                String productoOrdenado = obj.getString("productoOrdenado");
                String cantidadProducto = obj.getString("cantidadProducto");
                String totalPrecio = obj.getString("totalPrecio");

                // Imprimir la información de cada
                System.out.println("*****Generacion de Factura******");
                System.out.println("No. Factura: " + no);
                System.out.println("Nombre de cliente: " + cliente);
                System.out.println("Telefono de cliente: " + telefono);
                System.out.println("Productos: " + productoOrdenado);
                System.out.println("Total: " + totalPrecio);
                System.out.println("Productos vendidos: " + cantidadProducto);
                System.out.println("---------------------------------");
	        
		}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch (org.json.JSONException e) 
		{
            System.out.println("Error al parsear JSON: " + e.getMessage());
        }
		
	}

}
