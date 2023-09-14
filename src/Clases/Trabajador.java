package Clases;

import java.util.ArrayList;

/**
 * Clase para representar a un trabajador del zoologico
 */
public class Trabajador {
	protected String rfc;
	protected String nombre;
	protected String paterno;
	protected String materno;
	protected String genero;
	protected String calle;
	protected int numExterior;
	protected int numInterior;
	protected String colonia;
	protected String estado;
	protected String inicioContrato;
	protected String finContrato;
	protected String nacimiento;
	protected ArrayList<Long> telefonos;
	protected ArrayList<String> correos;

	/**
	 * Constructor sin argumentos
	 */
	public Trabajador() {
		telefonos = new ArrayList<Long>();
		correos = new ArrayList<String>();
	}

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param rfc
	 * @param nombre
	 * @param paterno
	 * @param materno
	 * @param genero
	 * @param calle
	 * @param numExterior
	 * @param numInterior
	 * @param colonia
	 * @param estado
	 * @param inicioContrato
	 * @param finContrato
	 * @param nacimiento
	 * @param telefonos
	 * @param correos
	 */
	public Trabajador(String rfc, String nombre, String paterno, String materno, String genero,
			String calle, int numExterior, int numInterior, String colonia, String estado, String inicioContrato,
			String finContrato, String nacimiento, ArrayList<Long> telefonos,
			ArrayList<String> correos) {
		super();
		this.rfc = rfc;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.genero = genero;
		this.calle = calle;
		this.numExterior = numExterior;
		this.numInterior = numInterior;
		this.colonia = colonia;
		this.estado = estado;
		this.inicioContrato = inicioContrato;
		this.finContrato = finContrato;
		this.nacimiento = nacimiento;
		this.correos = correos;
		this.telefonos = telefonos;
	}

	/**
	 * Metodo para obtener la fecha de fin de contrato
	 * 
	 * @return String
	 */
	public String getFinContrato() {
		return finContrato;
	}

	/**
	 * Metodo para modificar la fecha de fin de contrato
	 * 
	 * @param finContrato
	 */
	public void setFinContrato(String finContrato) {
		this.finContrato = finContrato;
	}

	/**
	 * Metodo para obtener la fecha de inicio de contrato
	 * 
	 * @return string
	 */
	public String getInicioContrato() {
		return inicioContrato;
	}

	/**
	 * Metodo para asignar la fecha de inicio de contrato
	 * 
	 * @param inicioContrato
	 */
	public void setInicioContrato(String inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	/**
	 * Metodo para obtener el genero del trabajador
	 * 
	 * @return String
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Metodo para asignar el genero del trabajador
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Metodo para obtener el RFC del trabajador
	 * 
	 * @return String
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * Metodo para asignar el RFC del trabajador
	 * 
	 * @param rfc
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * Metodo para obtener el nombre del trabajador
	 * 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para asignar nombre al trabajador
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el apellido paterno del trabajador
	 * 
	 * @return String
	 */
	public String getPaterno() {
		return paterno;
	}

	/**
	 * Metodo para asignar el apellido paterno del trabajador
	 * 
	 * @param paterno
	 */
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	/**
	 * Metodo para obtener el apellido materno del trabajador
	 * 
	 * @return String
	 */
	public String getMaterno() {
		return materno;
	}

	/**
	 * Metodo para asignar el apellido materno al trabajador
	 * 
	 * @param materno
	 */
	public void setMaterno(String materno) {
		this.materno = materno;
	}

	/**
	 * Metodo para obtener la calla del domicilio del trabajador
	 * 
	 * @return String
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Metodo para modificar la calle del domicilio del trabajador
	 * 
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Metodo para obtener el numero interior del domicilio del trabajador
	 * 
	 * @return int
	 */
	public int getNumInterior() {
		return numInterior;
	}

	/**
	 * Metodo para modificar el numero interior del domicilio del trabajador
	 * 
	 * @param numInterior
	 */
	public void setNumInterior(int numInterior) {
		this.numInterior = numInterior;
	}

	/**
	 * Metodo para obtener el numero exterior del domicilio del trabajador
	 * 
	 * @return int
	 */
	public int getNumExterior() {
		return numExterior;
	}

	/**
	 * Metodo para modificar el numero exterior del domicilio del trabajador
	 * 
	 * @param numExterior
	 */
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}

	/**
	 * Metodo para obtener la colonia del domicilio del trabajador
	 * 
	 * @return String
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * Metodo para modificar la colonia del domicilio del trabajador
	 * 
	 * @param colonia
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * Metodo para obtener el estado del domicilio del trabajador
	 * 
	 * @return String
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Metodo para modificar el estado del domicilio del trabajador
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Metodo para obtener la fecha de nacimiento del trabajador
	 * 
	 * @return String
	 */
	public String getNacimiento() {
		return nacimiento;
	}

	/**
	 * Metodo para asignar la fecha de nacimiento del trabajador
	 * 
	 * @param nacimiento
	 */
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	/**
	 * Metodo para obtener la lista de correos electronicos del trabajador
	 * 
	 * @return ArrayList <String>
	 */
	public ArrayList<String> getCorreos() {
		return correos;
	}

	/**
	 * Metodo para asignar la lista de correos electronicos del trabajador
	 * 
	 * @param correos
	 */
	public void setcorreos(ArrayList<String> correos) {
		this.correos = correos;
	}

	/**
	 * Metodo para obtener la lista de teléfonos del trabajador.
	 * 
	 * @return ArrayList<Long>
	 */
	public ArrayList<Long> getTelefonos() {
		return telefonos;
	}

	/**
	 * Metodo para asignar la lista de nuumero de telefonoss del trabajador
	 * 
	 * @param telefonos
	 */
	public void setTelefonos(ArrayList<Long> telefonos) {
		this.telefonos = telefonos;
	}

	/**
	 * Metodo para agregar un correos a la lista de correoss del trabajador
	 * 
	 * @param correos
	 */
	public void addCorreos(String correo) {
		correos.add(correo);
	}

	/**
	 * Metodo para eliminar un correos de la lista de e-Mails del trabajador
	 * 
	 * @param correos
	 * @return boolean: true si se pudo eliminar correctamente, false si el elemento
	 *         no estaba en la lista
	 */
	public boolean eliminarCorreo(String correo) {
		if (correos.contains(correo)) {
			correos.remove(correo);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo para agregar un telefonos a la lista de teléfonos del trabajador
	 * 
	 * @param telefonosN
	 */
	public void addTelefonos(Long telefonosN) {
		telefonos.add(telefonosN);
	}

	/**
	 * Metodo para eliminar un telefonos de la lista de telefonoss del trabajador
	 * 
	 * @param telefonos
	 * @return
	 */
	public boolean eliminartelefonos(Long tel) {
		if (telefonos.contains(tel)) {
			telefonos.remove(tel);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Trabajador [rfc=" + rfc + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno
				+ ", genero=" + genero + ", calle=" + calle + ", numExterior=" + numExterior + ", numInterior="
				+ numInterior + ", colonia=" + colonia + ", estado=" + estado + ", inicioContrato=" + inicioContrato
				+ ", finContrato=" + finContrato + ", nacimiento=" + nacimiento + ", telefonos=" + telefonos
				+ ", correos=" + correos + "]";
	}

	/**
	 * Método para representar el trabajador como un string para csv.
	 * 
	 * @return String
	 */
	public String toStringCsv() {
		ArrayList<String> telefonosString = new ArrayList<>();
		for (Long telefono : telefonos) {
			telefonosString.add(Long.toString(telefono));
		}
		return rfc + "," + nombre + "," + paterno + "," + materno
				+ "," + genero + "," + calle + "," + numExterior + ","
				+ numInterior + "," + colonia + "," + estado + "," + inicioContrato
				+ "," + finContrato + "," + nacimiento + "," + arrayToString(telefonosString)
				+ "," + arrayToString(correos);
	}

	/**
	 * Método para transformar arreglo en representación de cadena.
	 * 
	 * @param array
	 * @return
	 */
	public String arrayToString(ArrayList<String> array) {
		// [word1:word2:word3]
		String s = "[";
		for (int i = 0; i < array.size(); i++) {
			if (i != 0) {
				s += ":";
			}
			String word = array.get(i);
			s += word;
		}
		return s + "]";
	}

}
