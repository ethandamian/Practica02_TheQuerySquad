package Clases;
import java.util.ArrayList;

/**
 * Clase para representar a un trabajador del zoologico
 */
public class Trabajador {
	String finContrato;
	String inicioContrato;
	String genero;
	String rfc;
	String nombre;
	String paterno;
	String materno;
	String calle;
	int numInterior;
	int numExterior;
	String colonia;
	String estado;
	String nacimiento;
	ArrayList<String> eMail;
	ArrayList<Long> telefono;
	
	/**
	 * Constructor sin argumentos
	 */
	public Trabajador() {
		telefono = new ArrayList<Long>();
		eMail = new ArrayList<String>();
	}

	
	/**
	 * Constructor con todos los atributos
	 * @param finContrato
	 * @param inicioContrato
	 * @param genero
	 * @param rfc
	 * @param nombre
	 * @param paterno
	 * @param materno
	 * @param calle
	 * @param numInterior
	 * @param numExterior
	 * @param colonia
	 * @param estado
	 * @param nacimiento
	 * @param eMail
	 * @param telefono
	 */
	public Trabajador(String finContrato, String inicioContrato, String genero, String rfc, String nombre,
			String paterno, String materno, String calle, int numInterior, int numExterior, String colonia,
			String estado, String nacimiento, ArrayList<String> eMail, ArrayList<Long> telefono) {
		super();
		this.finContrato = finContrato;
		this.inicioContrato = inicioContrato;
		this.genero = genero;
		this.rfc = rfc;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.calle = calle;
		this.numInterior = numInterior;
		this.numExterior = numExterior;
		this.colonia = colonia;
		this.estado = estado;
		this.nacimiento = nacimiento;
		this.eMail = eMail;
		this.telefono = telefono;
	}


	/**
	 * Metodo para obtener la fecha de fin de contrato
	 * @return String
	 */
	public String getFinContrato() {
		return finContrato;
	}

	/**
	 * Metodo para modificar la fecha de fin de contrato
	 * @param finContrato
	 */
	public void setFinContrato(String finContrato) {
		this.finContrato = finContrato;
	}

	/**
	 * Metodo para obtener la fecha de inicio de contrato
	 * @return string
	 */
	public String getInicioContrato() {
		return inicioContrato;
	}

	/**
	 * Metodo para asignar la fecha de inicio de contrato
	 * @param inicioContrato
	 */
	public void setInicioContrato(String inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	/**
	 * Metodo para obtener el genero del trabajador
	 * @return String
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Metodo para asignar el genero del trabajador
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Metodo para obtener el RFC del trabajador
	 * @return String
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * Metodo para asignar el RFC del trabajador
	 * @param rfc
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * Metodo para obtener el nombre del trabajador
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para asignar nombre al trabajador
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el apellido paterno del trabajador
	 * @return String
	 */
	public String getPaterno() {
		return paterno;
	}

	/**
	 * Metodo para asignar el apellido paterno del trabajador
	 * @param paterno
	 */
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	/**
	 * Metodo para obtener el apellido materno del trabajador
	 * @return String
	 */
	public String getMaterno() {
		return materno;
	}

	/**
	 * Metodo para asignar el apellido materno al trabajador
	 * @param materno
	 */
	public void setMaterno(String materno) {
		this.materno = materno;
	}

	/**
	 * Metodo para obtener la calla del domicilio del trabajador
	 * @return String
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Metodo para modificar la calle del domicilio del trabajador
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Metodo para obtener el numero interior del domicilio del trabajador
	 * @return int
	 */
	public int getNumInterior() {
		return numInterior;
	}

	/**
	 * Metodo para modificar el numero interior del domicilio del trabajador
	 * @param numInterior
	 */
	public void setNumInterior(int numInterior) {
		this.numInterior = numInterior;
	}

	/**
	 * Metodo para obtener el numero exterior del domicilio del trabajador
	 * @return int
	 */
	public int getNumExterior() {
		return numExterior;
	}

	/**
	 * Metodo para modificar el numero exterior del domicilio del trabajador
	 * @param numExterior
	 */
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}

	/**
	 * Metodo para obtener la colonia del domicilio del trabajador
	 * @return String
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * Metodo para modificar la colonia del domicilio del trabajador
	 * @param colonia
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * Metodo para obtener el estado del domicilio del trabajador
	 * @return String
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Metodo para modificar el estado del domicilio del trabajador
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Metodo para obtener la fecha de nacimiento del trabajador
	 * @return String
	 */
	public String getNacimiento() {
		return nacimiento;
	}

	/**
	 * Metodo para asignar la fecha de nacimiento del trabajador
	 * @param nacimiento
	 */
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	/**
	 * Metodo para obtener la lista de correos electronicos del trabajador
	 * @return ArrayList <String>
	 */
	public ArrayList<String> geteMail() {
		return eMail;
	}

	/**
	 * Metodo para asignar la lista de correos electronicos del trabajador
	 * @param eMail
	 */
	public void seteMail(ArrayList<String> eMail) {
		this.eMail = eMail;
	}

	/**
	 * Metodo para obtener la lista de teléfonos del trabajador.
	 * @return ArrayList<Long>
	 */
	public ArrayList<Long> getTelefono() {
		return telefono;
	}

	/**
	 * Metodo para asignar la lista de nuumero de telefonos del trabajador
	 * @param telefono
	 */
	public void setTelefono(ArrayList<Long> telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
	
	
}
