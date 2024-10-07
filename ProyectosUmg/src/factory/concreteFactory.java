package factory;

import Concrete.concretePeticion;
import Interface.IGeneral;

import Concrete.concreteConsulta;
import Concrete.concreteEstado;
import Concrete.concreteFactura;
import Interface.IConsulta;
import Interface.IEstado;
import Interface.IFactura;
public class concreteFactory extends abstractFactory {

	@Override
	public IGeneral peticion(int tipo) {
        switch (tipo) {
        case 1:
            return new concretePeticion();
        default:
            return null;
    }
	}

	@Override
	public IConsulta Consultar(int tipo) {
        switch (tipo) {
        case 1:
            return new concreteConsulta();
        default:
		return null;
	}

}

	@Override
	public IFactura Factura(int tipo) {
        switch (tipo) {
        case 1:
            return new concreteFactura();
        default:
		return null;
	}
	
}

	@Override
	public IEstado Estado(int tipo) {
        switch (tipo) {
        case 1:
            return new concreteEstado();
        default:
		return null;
	}
}
}
