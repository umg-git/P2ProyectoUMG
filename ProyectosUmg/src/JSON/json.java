package JSON;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class json {
	
	//Metodo que carga el archivo json
	public void lecturaJSON() {

		//ruta relativa
		String archivoJSON = "src\\files\\catalogo.json";
		try {
	        // Lee el archivo json
            String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

            // Convertie el String a un objeto json
            JSONObject objetoJSON = new JSONObject(contenido);

            // Obtiene el arreglo de platos fuertes
            JSONArray item = objetoJSON.getJSONArray("Catalogo");

            // Recorre cada elemento del arreglo
            for (int i = 0; i < item.length(); i++) {
                JSONObject obj = item.getJSONObject(i);

                // Extrae los valores del plato
                String tipo = obj.getString("tipo");
                String nombre = obj.getString("nombre");
                String precio = obj.getString("precio");
                String stock = obj.getString("stock");
                String tamaño = obj.getString("tamaño");
                String estado = obj.getString("estado");
                

                // Imprimir la información de cada plato
                System.out.println("Tipo: " + tipo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Precio: " + precio);
                System.out.println("Stock: " + stock);
                System.out.println("Tamaño: " + tamaño);
                System.out.println("Estado: " + estado);
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

	//Metodo para escribir sobre el archivo json
	public void escribirJSON() {
		Scanner sc = new Scanner(System.in);
		String tipo, descripcion, precio, stock, tamaño, estado;
		String archivoJSON = "src\\files\\catalogo.json";
		try {
	        
	        // Leer el archivo json existente como un string
	        String contenido = new String(Files.readAllBytes(Paths.get(archivoJSON)));

	        // Convierte el string a un objeto json
	        JSONObject objetoJSON = new JSONObject(contenido);

	        // Obtiene el arreglo de camisas
	        JSONArray items = objetoJSON.getJSONArray("Catalogo");

	        //Solicitamos los datos del producto
	        System.out.println("Ingrese el tipo de producto(camisa o sueter)");
	        tipo = sc.nextLine();
	        System.out.println("Ingrese la descripcion del producto.");
	        descripcion = sc.nextLine();
	        System.out.println("Ingrese el precio del producto.");
	        precio = sc.nextLine();
	        System.out.println("Ingrese el stock del producto.");
	        stock = sc.nextLine();
	        System.out.println("Ingrese la talla del producto(s, m, l, etc)");
	        tamaño = sc.nextLine();
	        System.out.println("Ingrese el estado de. producto(D=disponible, P=produccion)");
	        estado = sc.nextLine();
	        
	        // Crea un nuevo registro para agregar al arreglo
	        JSONObject nuevoRegistro = new JSONObject();
	        nuevoRegistro.put("tipo", tipo);
	        nuevoRegistro.put("nombre", descripcion);
	        nuevoRegistro.put("precio", precio);
	        nuevoRegistro.put("stock", stock);
	        nuevoRegistro.put("tamaño", tamaño);
	        nuevoRegistro.put("estado", estado);

	        // Agrega el nuevo item al arreglo
	        items.put(nuevoRegistro);

	        // Actualiza el json original con los nuevos datos
	        objetoJSON.put("catalogo", items);

	        // Escribe el nuevo json en el archivo (sobrescribiendo el archivo anterior)
	        Files.write(Paths.get(archivoJSON), objetoJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);

	        System.out.println("Nuevo registro agregado correctamente.");
	        
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
