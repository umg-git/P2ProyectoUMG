package Concrete;
import Interface.IProducto;

import java.util.*;
import JSON.json;

public class concreteCamisas implements  IProducto {

	@Override
	public void Producir() {
		Scanner sc = new Scanner(System.in);
		json obj = new json();
		int op = 0;
		System.out.println("Por favor ingrese la opcion.");
		System.out.println("1. Ver productos");
		System.out.println("2. Cargar productos");
		op = sc.nextInt();
		
		switch(op) {
		case 1:			
			obj.lecturaJSON();
			break;
		case 2:
			obj.escribirJSON();
			break;
		default:
			System.out.println("Opcion invalidad.");
		}		
	}
}
