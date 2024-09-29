package factory;
import Interface.IProducto;

public abstract class abstractFactory {
	public abstract IProducto crearProducto(String tipo);
}
