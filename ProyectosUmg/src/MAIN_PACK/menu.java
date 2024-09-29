package MAIN_PACK;

public class menu {
	
	
	private static void mensaje(String cadena) {
		System.out.println(cadena);
	}
	
	public void Menu() {
		mensaje("Seleccione un opcion.");
		mensaje("1. Ventas.");
		mensaje("2. Compras.");
		mensaje("3. Cliente.");
		mensaje("4. Producto.");
		mensaje("5. Facturación.");
		mensaje("6. unknown");
		mensaje("7. unknown");
	}
	
	public String seleccion(int op) {
		String respuesta = "";
		if(op == 1) {
			
		}
		return null;
	}
	
}
