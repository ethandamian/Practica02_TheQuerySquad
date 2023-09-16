/**
 * 
 */
package Clases;

/**
 * Clase para representar animales
 */
public class Animal {
	protected String nombre;
	protected String especie;
	protected float pesoKg;
	protected float alturaCm;
	protected String sexo;
	protected int id;
	protected int numJaula;
	protected String alimentacion;
	protected String indicacionesMedicas;

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param nombre
	 * @param especie
	 * @param pesoKg
	 * @param alturaCm
	 * @param sexo
	 * @param numJaula
	 * @param alimentacion
	 * @param indicacionesMedicas
	 */
	public Animal(String nombre, String especie, float pesoKg, float alturaCm, String sexo, int numJaula,
			String alimentacion, String indicacionesMedicas, int id) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.pesoKg = pesoKg;
		this.alturaCm = alturaCm;
		this.sexo = sexo;
		this.numJaula = numJaula;
		this.alimentacion = alimentacion;
		this.indicacionesMedicas = indicacionesMedicas;
		this.id = id;
	}

	/**
	 * Constructor sin id.
	 * 
	 * @param nombre
	 * @param especie
	 * @param pesoKg
	 * @param alturaCm
	 * @param sexo
	 * @param numJaula
	 * @param alimentacion
	 * @param indicacionesMedicas
	 */
	public Animal(String nombre, String especie, float pesoKg, float alturaCm, String sexo, int numJaula,
			String alimentacion, String indicacionesMedicas) {
		this.nombre = nombre;
		this.especie = especie;
		this.pesoKg = pesoKg;
		this.alturaCm = alturaCm;
		this.sexo = sexo;
		this.numJaula = numJaula;
		this.alimentacion = alimentacion;
		this.indicacionesMedicas = indicacionesMedicas;
	}
	
	/**
	 * Constructor con tes paramateros: nombre, especie y numero de jaula
	 * @param nombre EL nombre del animal
	 * @param especie La especie del animal
	 * @param numJaula EL numero de jaula del animal
	 */
	public Animal(String nombre,String especie, int numJaula) {
		this.nombre = nombre;
		this.especie = especie;
		this.numJaula = numJaula;
	}

	/**
	 * Metodo para obtener el id del animal
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo para modificar el id del animal
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo para obtener el nombre del animal
	 * 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para asignar el nombre del animal
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener la especie del animal
	 * 
	 * @return String
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * Metodo para asignar la especie del animal
	 * 
	 * @param especie
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * Metodo para obtener el peso en kg del animal
	 * 
	 * @return float
	 */
	public float getPesoKg() {
		return pesoKg;
	}

	/**
	 * Metodo para asignar el peso en kg del animal
	 * 
	 * @param pesoKg
	 */
	public void setPesoKg(float pesoKg) {
		this.pesoKg = pesoKg;
	}

	/**
	 * Metodo para obtener la altura en cm del animal
	 * 
	 * @return float
	 */
	public float getAlturaCm() {
		return alturaCm;
	}

	/**
	 * Metodo para asignar la altura en cm del animal
	 * 
	 * @param alturaCm
	 */
	public void setAlturaCm(float alturaCm) {
		this.alturaCm = alturaCm;
	}

	/**
	 * Metodo para obtener el sexo del animal
	 * 
	 * @return String
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Metodo para asignar el sexo del animal
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Metodo para obtener el numero de jaula del animal
	 * 
	 * @return int
	 */
	public int getNumJaula() {
		return numJaula;
	}

	/**
	 * Metodo para asignar el numero de jaula del animal
	 * 
	 * @param numJaula
	 */
	public void setNumJaula(int numJaula) {
		this.numJaula = numJaula;
	}

	/**
	 * Metodo para obtener el tipo de alimentación del animal
	 * 
	 * @return String
	 */
	public String getAlimentacion() {
		return alimentacion;
	}

	/**
	 * Método para asignar el tipo de alimentacion del animal
	 * 
	 * @param alimentacion
	 */
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	/**
	 * Metodo para obtener las indicaciones medicas del animal
	 * 
	 * @return String
	 */
	public String getIndicacionesMedicas() {
		return indicacionesMedicas;
	}

	/**
	 * Metodo para asignar las indicaciones medicas del animal
	 * 
	 * @param indicacionesMedicas
	 */
	public void setIndicacionesMedicas(String indicacionesMedicas) {
		this.indicacionesMedicas = indicacionesMedicas;
	}

	/**
	 * Método para representar el bioma como un string sin id.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", pesoKg=" + pesoKg + ", alturaCm=" + alturaCm
				+ ", sexo=" + sexo + ", id=" + id + ", numJaula=" + numJaula + ", alimentacion=" + alimentacion
				+ ", indicacionesMedicas=" + indicacionesMedicas + "]";
	}

	public String toStringNoId() {
		return nombre + "," + especie + "," + pesoKg + "kg," + alturaCm
				+ "cm," + sexo + "," + numJaula + "," + alimentacion
				+ "," + indicacionesMedicas;
	}

}
