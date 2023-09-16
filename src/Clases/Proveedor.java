/**
 * 
 */
package Clases;

import java.util.ArrayList;

/**
 * Clase proveedor para representar a un proveedor de productos del zoológico
 */
public class Proveedor extends Trabajador {

	protected String producto;
	protected String frecuenciaServicio;
	protected float costoServicio;

	/**
	 * Metodo constructor sin argumentos
	 */
	public Proveedor() {
		super();
	}

	/**
	 * Metodo constructor con todos los atributos
	 * 
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
	public Proveedor(String finContrato, String inicioContrato, String genero, String rfc, String nombre,
			String paterno, String materno, String calle, String numInterior, String numExterior, String colonia,
			String estado, String nacimiento, ArrayList<String> correos, ArrayList<String> telefonos, String producto,
			String frecuenciaServicio, float costoServicio) {
		super(rfc, nombre, paterno, materno, genero,
				calle, numExterior, numInterior, colonia, estado, inicioContrato, finContrato,
				nacimiento, telefonos, correos);
		this.producto = producto;
		this.frecuenciaServicio = frecuenciaServicio;
		this.costoServicio = costoServicio;
	}

	/**
	 * Metodo para obtener el producto que provee
	 * 
	 * @return String
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * Metodo para modificar el producto que provee
	 * 
	 * @param producto
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * Metodo para obtener la frecuencia en que el proveedor ofrece su servicio
	 * 
	 * @return String
	 */
	public String getFrecuenciaServicio() {
		return frecuenciaServicio;
	}

	/**
	 * Método para modificar la frecuencia de servicio
	 * 
	 * @param frecuenciaServicio
	 */
	public void setFrecuenciaServicio(String frecuenciaServicio) {
		this.frecuenciaServicio = frecuenciaServicio;
	}

	/**
	 * Metodo para obtener el costo por servicio
	 * 
	 * @return float
	 */
	public float getCostoServicio() {
		return costoServicio;
	}

	/**
	 * Metodo para modificar el costo por servicio
	 * 
	 * @param costoServicio
	 */
	public void setCostoServicio(float costoServicio) {
		this.costoServicio = costoServicio;
	}

}
