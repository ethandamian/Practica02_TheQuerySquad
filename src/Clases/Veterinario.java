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
	 * @param especialidad
	 * @param salario
	 */
	public Veterinario(String rfc, String nombre, String paterno, String materno, String genero,
			String calle, String numExterior, String numInterior, String colonia, String estado, String inicioContrato,
			String finContrato, String nacimiento, ArrayList<String> telefonos,
			ArrayList<String> correos, String especialidad,
			float salario) {
		super(rfc, nombre, paterno, materno, genero,
				calle, numExterior, numInterior, colonia, estado, inicioContrato, finContrato,
				nacimiento, telefonos, correos);
		this.especialidad = especialidad;
		this.salario = salario;

	}

	
	/**
	 * Constructor con tres atributos
	 * 
	 * @param rfc
	 * @param nombre
	 
	 * @param especialidad
	 */
	public Veterinario(String rfc, String nombre, String especialidad) {
		this.rfc = rfc;
		this.nombre = nombre;
		this.especialidad = especialidad;
		
	}

	/**
	 * Metodo para obtener la especiallidad del veterinario
	 * 
	 * @return String
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Metodo para asignar la especialidad del veterinario
	 * 
	 * @param especialidad
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Metodo para obtener el salario del veterinario
	 * 
	 * @return float
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Metodo para modificar el salario del veterinario
	 * 
	 * @param salario
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

	/**
	 * Método para representar el veterinario como un string para csv.
	 * 
	 * @return String
	 */
	public String toStringCsv() {
		return super.toStringCsv() + "," + especialidad + "," + Float.toString(salario);
	}
	
	/**
	 * Método para representar el trabajador como un string cpn tres atributos.
	 * 
	 * @return String
	 */
	public String toStringTresAtributos() {
		return super.toStringTresAtributos() + "," + especialidad;
	}

}
