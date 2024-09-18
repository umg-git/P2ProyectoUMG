package APP;
import java.util.*;

public class Main {

	private static void mensaje(String cadena) {
		System.out.println(cadena);
	}
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		json obj = new json();// se instancia de la clase json para acceder a sus metodos
		mensaje("Seleccione un operacion a realizar");
		mensaje("1. Leer archivo json.");
		mensaje("2. Escribir al archivo json.");
		int op = sc.nextInt();
		
		switch(op){
		case 1:
			obj.lecturaJSON();
			break;
		case 2:
			obj.escribirJSON();
			break;
		}

	    }
	}


