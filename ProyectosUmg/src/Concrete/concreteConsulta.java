package Concrete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import Interface.IConsulta;
import Interface.IGeneral;

public class concreteConsulta implements  IConsulta {

	@Override
	public void consultar() {
		//ruta relativa
		String archivoJSON = "src\\files\\ordenes.json";
		try {
	        // Lee el archivo json
            String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

            // Convertie el String a un objeto json
            JSONObject objetoJSON = new JSONObject(contenido);

            // Obtiene el arreglo de platos fuertes
            JSONArray item = objetoJSON.getJSONArray("ordenes");

            // Recorre cada elemento del arreglo
            for (int i = 0; i < item.length(); i++) {
                JSONObject obj = item.getJSONObject(i);

                // Extrae los valores del 
                String no = obj.getString("noOrden");
                String cliente = obj.getString("cliente");
                String telefono = obj.getString("telefono");
                String productoOrdenado = obj.getString("productoOrdenado");
                

                // Imprimir la información de cada 
                System.out.println("No. Orden " + no);
                System.out.println("cliente: " + cliente);
                System.out.println("telefono: " + telefono);
                System.out.println("productoOrdenado: " + productoOrdenado);
                System.out.println("--------------------");
	        
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
