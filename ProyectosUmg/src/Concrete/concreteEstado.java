package Concrete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import Interface.IEstado;
import Interface.IFactura;

public class concreteEstado implements  IEstado {

	@Override
	public void estado() {
		//ruta relativa
		String archivoJSON = "src\\files\\estadoOrdenes.json";
		try {
	        // Lee el archivo json
            String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

            // Convertie el String a un objeto json
            JSONObject objetoJSON = new JSONObject(contenido);

            // Obtiene el arreglo de platos fuertes
            JSONArray item = objetoJSON.getJSONArray("estadoOrdenes");

            // Recorre cada elemento del arreglo
            for (int i = 0; i < item.length(); i++) {
                JSONObject obj = item.getJSONObject(i);

                // Extrae los valores del 
                String no = obj.getString("noOrden");
                String estado = obj.getString("estado");

                

                // Imprimir la información de cada 
                System.out.println("No. Orden " + no);
                System.out.println("estado: " + estado);
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
