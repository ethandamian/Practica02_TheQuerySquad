/**
 * 
 */
package Clases;

import java.util.ArrayList;

/**
 * Clase para representar a un veterinario del zoológico
 */
public class Veterinario extends Trabajador {
	
	protected String especialidad;
	protected float salario;
	
	/**
	 * Constructor sin argumentos
	 */
	public Veterinario() {
		super();
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
	 * @param especialidad
	 * @param salario
	 */
	public Veterinario(String finContrato, String inicioContrato, String genero, String rfc, String nombre,
			String paterno, String materno, String calle, int numInterior, int numExterior, String colonia,
			String estado, String nacimiento, ArrayList<String> eMail, ArrayList<Long> telefono, String especialidad, float salario) {
		super(finContrato, inicioContrato, genero, rfc, nombre, paterno, materno, calle, numInterior, numExterior,
				colonia, estado, nacimiento, eMail, telefono);
		this.especialidad = especialidad;
		this.salario=salario;
		
	}

	/**
	 * Metodo para obtener la especiallidad del veterinario
	 * @return String
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Metodo para asignar la especialidad del veterinario
	 * @param especialidad
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Metodo para obtener el salario del veterinario
	 * @return float
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Metodo para modificar el salario del veterinario
	 * @param salario
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
