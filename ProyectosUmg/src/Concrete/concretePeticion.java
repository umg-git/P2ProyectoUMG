package Concrete;
import Interface.IGeneral;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

import JSON.json;

public class concretePeticion implements  IGeneral {

	@Override
	public void Peticion() {
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
