/**
 * 
 */
package Clases;

import java.util.ArrayList;

/**
 * Clase para representar a un trabajador del zoologico
 */
public class Cuidador extends Trabajador {
	protected String animalACargo;
	protected float salario;
	protected String diasTrabajo;
	protected String horarioLaboral;

	/**
	 * Metodo constructor sin argumentos
	 */
	public Cuidador() {
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
	public Cuidador(String finContrato, String inicioContrato, String genero, String rfc, String nombre, String paterno,
			String materno, String calle, String numInterior, String numExterior, String colonia, String estado,
			String nacimiento, ArrayList<String> correos, ArrayList<String> telefonos, String animalACargo, float salario,
			String diasTrabajo, String horarioLaboral) {
		super(rfc, nombre, paterno, materno, genero,
				calle, numExterior, numInterior, colonia, estado, inicioContrato, finContrato,
				nacimiento, telefonos, correos);
		this.animalACargo = animalACargo;
		this.salario = salario;
		this.diasTrabajo = diasTrabajo;
		this.horarioLaboral = horarioLaboral;
	}

	/**
	 * Metodo para obtener el animal del que se encarga
	 * 
	 * @return String
	 */
	public String getAnimalACargo() {
		return animalACargo;
	}

	/**
	 * Metodo para modificar al animal del que se encarga
	 * 
	 * @param animalACargo
	 */
	public void setAnimalACargo(String animalACargo) {
		this.animalACargo = animalACargo;
	}

	/**
	 * Metodo para obtener el salario del cuidador
	 * 
	 * @return float
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Metodo para modificar el salario del cuidador
	 * 
	 * @param salario
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

	/**
	 * Metodo para obtener los dias de trabajo del cuidador
	 * 
	 * @return
	 */
	public String getDiasTrabajo() {
		return diasTrabajo;
	}

	/**
	 * Metodo para cambiar los dias de trabajo del cuidador
	 * 
	 * @param diasTrabajo
	 */
	public void setDiasTrabajo(String diasTrabajo) {
		this.diasTrabajo = diasTrabajo;
	}

	/**
	 * Metodo para obtener el horario laboral del cuidador
	 * 
	 * @return String
	 */
	public String getHorarioLaboral() {
		return horarioLaboral;
	}

	/**
	 * Método para modificar el horario laboral del cuidador
	 * 
	 * @param horarioLaboral
	 */
	public void setHorarioLaboral(String horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}

}
