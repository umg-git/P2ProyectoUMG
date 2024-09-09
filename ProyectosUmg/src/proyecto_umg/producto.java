
//**************************************************************
//******************* CLASE PRODUCTO ***************************
//**************************************************************

package proyecto_umg;

public class producto {

	private String _codigo = "";
	private String _nombre = "";
	private String _precio = "";
	private String _estado = "";
	
	public producto(String _codigo, String _nombre, String _precio, String _estado) {
		super();
		this._codigo = _codigo;
		this._nombre = _nombre;
		this._precio = _precio;
		this._estado = _estado;
	}

	public String get_codigo() {
		return _codigo;
	}

	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public String get_precio() {
		return _precio;
	}

	public void set_precio(String _precio) {
		this._precio = _precio;
	}

	public String get_estado() {
		return _estado;
	}

	public void set_estado(String _estado) {
		this._estado = _estado;
	}
	
	
}
