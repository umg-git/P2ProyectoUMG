package factory;

import Concrete.concreteCamisas;
import Concrete.concreteSueter;
import Interface.IProducto;

public class concreteFactory extends abstractFactory {

	@Override
	public IProducto crearProducto(String tipo) {
        switch (tipo) {
        case "camisas":
            return new concreteCamisas();
        case "sueteres":
            return new concreteSueter();
        default:
            return null;
    }
	}

}
