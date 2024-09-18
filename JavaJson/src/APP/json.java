package APP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.json.JSONArray;
import org.json.JSONObject;

public class json {
	
	public void lecturaJSON() {
		String archivoJSON = "src\\resources\\Menu.json";
		try {
	        // Lee el archivo json
            String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

            // Convertie el String a un objeto json
            JSONObject objetoJSON = new JSONObject(contenido);

            // Obtiene el arreglo de platos fuertes
            JSONArray platos = objetoJSON.getJSONArray("PlatoFuerte");

            // Recorre cada elemento del arreglo
            for (int i = 0; i < platos.length(); i++) {
                JSONObject plato = platos.getJSONObject(i);

                // Extrae los valores del plato
                String nombre = plato.getString("nombre");
                int precio = plato.getInt("precio");
                int duracion = plato.getInt("duracion");
                String tamaño = plato.getString("tamaño");

                // Imprimir la información de cada plato
                System.out.println("Nombre: " + nombre);
                System.out.println("Precio: " + precio);
                System.out.println("Duración: " + duracion);
                System.out.println("Tamaño: " + tamaño);
                System.out.println("--------------------");
	        
		}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void escribirJSON() {
		String archivoJSON = "src\\resources\\Menu.json";
		try {
	        
	        // Leer el archivo json existente como un string
	        String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

	        // Convierte el string a un objeto json
	        JSONObject objetoJSON = new JSONObject(contenido);

	        // Obtiene el arreglo de platos fuertes
	        JSONArray platos = objetoJSON.getJSONArray("PlatoFuerte");

	        // Crea un nuevo plato para agregar al arreglo
	        JSONObject nuevoPlato = new JSONObject();
	        nuevoPlato.put("nombre", "Pizza");
	        nuevoPlato.put("precio", 2000);
	        nuevoPlato.put("duracion", 10);
	        nuevoPlato.put("tamaño", "entero");

	        // Agrega el nuevo plato al arreglo
	        platos.put(nuevoPlato);

	        // Actualiza el json original con los nuevos datos
	        objetoJSON.put("PlatoFuerte", platos);

	        // Escribe el nuevo json en el archivo (sobrescribiendo el archivo anterior)
	        Files.write(Paths.get(archivoJSON), objetoJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);

	        System.out.println("Nuevo plato agregado correctamente.");
	        
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
