package factory;
import Interface.IGeneral;
import Interface.IConsulta;
import Interface.IEstado;
import Interface.IFactura;

public abstract class abstractFactory {
	public abstract IGeneral peticion(int tipo);
	public abstract IConsulta Consultar(int tipo);
	public abstract IFactura Factura(int tipo);
	public abstract IEstado Estado(int tipo);
}
