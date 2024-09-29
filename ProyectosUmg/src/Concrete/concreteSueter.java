package Concrete;
import Interface.IProducto;

public class concreteSueter implements IProducto {

	@Override
	public void Producir() {
		System.out.println("Produciendo un sueteres.");
		
	}

}
