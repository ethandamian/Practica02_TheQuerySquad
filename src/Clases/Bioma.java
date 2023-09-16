/**
 * 
 */
package Clases;

import java.util.ArrayList;

/**
 * Clase Bioma que representa un bioma del zoológico
 */
public class Bioma {

	protected int id;
	protected String tipo;
	protected String servicio;
	protected int numJaulaas;
	protected int numVeterinarios;
	protected int numAnimales;
	protected int numCuidadores;

	/**
	 * Método constructor sin argumentos
	 */
	public Bioma() {
	}

	/**
	 * Método constructor con todos los atributos
	 * 
	 * @param tipo
	 * @param servicio
	 * @param numJaulaas
	 * @param numVeterinarios
	 * @param numAnimales
	 * @param numCuidadores
	 * @param serviciosAVisitantes
	 */
	public Bioma(int id, String tipo, String servicio, int numJaulaas, int numVeterinarios,
			int numAnimales, int numCuidadores) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.servicio = servicio;
		this.numJaulaas = numJaulaas;
		this.numVeterinarios = numVeterinarios;
		this.numAnimales = numAnimales;
		this.numCuidadores = numCuidadores;
	}
	
	
	/**
	 * Método constructor con todos los atributos
	 * 
	 * @param tipo
	 * @param servicio
	 * @param numJaulaas
	 * @param numVeterinarios
	 * @param numAnimales
	 * @param numCuidadores
	 * @param serviciosAVisitantes
	 */
	public Bioma(String tipo, String servicio, int numJaulaas, int numVeterinarios,
			int numAnimales, int numCuidadores) {
		this.tipo = tipo;
		this.servicio = servicio;
		this.numJaulaas = numJaulaas;
		this.numVeterinarios = numVeterinarios;
		this.numAnimales = numAnimales;
		this.numCuidadores = numCuidadores;
	}
	
	/**
	 * Método constructor con tres atributos
	 * 
	 * @param id El id 
	 * @param tipo le tipo de bioma 
	 * @param numJaulaas El numero de jaulas
	 */
	public Bioma(int id,String tipo,  int numJaulaas) {
		
		this.id = id;
		this.tipo = tipo;
		this.numJaulaas = numJaulaas;
		
	}

	/**
	 * Metodo para obtener el id del bioma
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo para modificar el id del bioma
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método para obtener el número de veterinarios que hay en el bionma
	 * 
	 * @return int
	 */
	public int getNumVeterinarios() {
		return numVeterinarios;
	}

	/**
	 * Método para modificar el número de veterinarios en el bioma
	 * 
	 * @param numVeterinarios
	 */
	public void setNumVeterinarios(int numVeterinarios) {
		this.numVeterinarios = numVeterinarios;
	}

	/**
	 * Método para obtener el número de jaulas que hay en el bioma
	 * 
	 * @return int
	 */
	public int getNumJaulaas() {
		return numJaulaas;
	}

	/**
	 * Método para modificar el número de jaulas que hay en el bioma
	 * 
	 * @param numJaulaas
	 */
	public void setNumJaulaas(int numJaulaas) {
		this.numJaulaas = numJaulaas;
	}

	/**
	 * Método para obtener el servicio que ofrece el bioma a los visitantes
	 * 
	 * @return String
	 */
	public String getServicio() {
		return servicio;
	}

	/**
	 * Método para modificar el servicio que ofrece el bioma
	 * 
	 * @param servicio
	 */
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	/**
	 * Método para obtener el tipo de bioma
	 * 
	 * @return String
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para modificar el tipo de bioma
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método para obtener el número de cuidadores que trabajan en el bioma.
	 * 
	 * @return int
	 */
	public int getNumCuidadores() {
		return numCuidadores;
	}

	/**
	 * Método para modificar el número de cuidadores que hay en el bioma
	 * 
	 * @param numCuidadores
	 */
	public void setNumCuidadores(int numCuidadores) {
		this.numCuidadores = numCuidadores;
	}

	/**
	 * Método para obtener el número de animales que hay en el bioma
	 * 
	 * @return int
	 */
	public int getNumAnimales() {
		return numAnimales;
	}

	/**
	 * Método para modificar el número de animales que hay en el bioma
	 * 
	 * @param numAnimales
	 */
	public void setNumAnimales(int numAnimales) {
		this.numAnimales = numAnimales;
	}


	

	@Override
	public String toString() {
		return "Bioma [id=" + id + ", tipo=" + tipo + ", servicio=" + servicio + ", numJaulaas=" + numJaulaas
				+ ", numVeterinarios=" + numVeterinarios + ", numAnimales=" + numAnimales + ", numCuidadores="
				+ numCuidadores + ", serviciosAVisitantes=" + "]";
	}

	/**
	 * Método para representar el bioma como un string sin id.
	 * 
	 * @return String
	 */
	public String toStringNoId() {
		return tipo + "," + servicio + "," + numJaulaas
				+ "," + numVeterinarios + "," + numAnimales + ","
				+ numCuidadores;
	}
	
	/**
	 * Método para representar el bioma como un string sin id.
	 * 
	 * @return String
	 */
	public String toStringConTresAtributos() {
		return id + "," + tipo + "," + numJaulaas;
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
