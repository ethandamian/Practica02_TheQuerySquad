/**
 * 
 */
package Clases;
import java.util.ArrayList;

/**
 * Clase Bioma que representa un bioma del zoológico
 */
public class Bioma {
	
	protected int numVeterinarios;
	protected int numJaulaas;
	protected String servicio;
	protected String tipo;
	protected int numCuidadores;
	protected int numAnimales;
	protected ArrayList<String> serviciosAVisitantes;
	protected int id;
	
	/**
	 * Método constructor sin argumentos
	 */
	public Bioma() {
		serviciosAVisitantes = new ArrayList<String>();
	}
	
	/**
	 * Método constructor con todos los atributos
	 * @param numVeterinarios
	 * @param numJaulaas
	 * @param servicio
	 * @param tipo
	 * @param numCuidadores
	 * @param numAnimales
	 * @param servicios
	 */
	public Bioma(int numVeterinarios, int numJaulaas, String servicio, String tipo, int numCuidadores,
			int numAnimales, ArrayList<String> servicios, int id) {
		super();
		this.numVeterinarios = numVeterinarios;
		this.numJaulaas = numJaulaas;
		this.servicio = servicio;
		this.tipo = tipo;
		this.numCuidadores = numCuidadores;
		this.numAnimales = numAnimales;
		this.serviciosAVisitantes = servicios;
		this.id=id;
	}
	
	/**
	 * Metodo para obtener el id del bioma
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo para modificar el id del bioma
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método para obtener el número de veterinarios que hay en el bionma
	 * @return int 
	 */
	public int getNumVeterinarios() {
		return numVeterinarios;
	}

	/**
	 * Método para modificar el número de veterinarios en el bioma
	 * @param numVeterinarios
	 */
	public void setNumVeterinarios(int numVeterinarios) {
		this.numVeterinarios = numVeterinarios;
	}


	/**
	 * Método para obtener el número de jaulas que hay en el bioma
	 * @return int
	 */
	public int getNumJaulaas() {
		return numJaulaas;
	}

	/**
	 * Método para modificar el número de jaulas que hay en el bioma
	 * @param numJaulaas
	 */
	public void setNumJaulaas(int numJaulaas) {
		this.numJaulaas = numJaulaas;
	}

	/**
	 * Método para obtener el servicio que ofrece el bioma a los visitantes
	 * @return String
	 */
	public String getServicio() {
		return servicio;
	}

	/**
	 * Método para modificar el servicio que ofrece el bioma
	 * @param servicio
	 */
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	/**
	 * Método para obtener el tipo de bioma
	 * @return String
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para modificar el tipo de bioma
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método para obtener el número de cuidadores que trabajan en el bioma.
	 * @return int
	 */
	public int getNumCuidadores() {
		return numCuidadores;
	}

	/**
	 * Método para modificar el número de cuidadores que hay en el bioma
	 * @param numCuidadores
	 */
	public void setNumCuidadores(int numCuidadores) {
		this.numCuidadores = numCuidadores;
	}

	/**
	 * Método para obtener el número de animales que hay en el bioma
	 * @return int
	 */
	public int getNumAnimales() {
		return numAnimales;
	}

	/**
	 * Método para modificar el número de animales que hay en el bioma
	 * @param numAnimales
	 */
	public void setNumAnimales(int numAnimales) {
		this.numAnimales = numAnimales;
	}

	/**
	 * Método para obtener la lista de servicios que ofrece el bioma a los visitantes
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getServiciosAVisitantes() {
		return serviciosAVisitantes;
	}

	/**
	 * Método para cambiar la lista de Servicios a Visitantes
	 * @param serviciosAVisitantes
	 */
	public void setServiciosAVisitantes(ArrayList<String> serviciosAVisitantes) {
		this.serviciosAVisitantes = serviciosAVisitantes;
	}
	
	/**
	 * Metodo para añadir un servicio a visitantes (baños, tiendas, comida)
	 * @param servicio
	 */
	public void addServicioAVisitantes(String servicio) {
		serviciosAVisitantes.add(servicio);
	}
	
	/**
	 * Metodo para eliminar un servicio de la lista de servicios a visitantes
	 * @param servicio
	 * @return boolean: true si se pudo eliminar, false si el servicio no estaba en la lista
	 */
	public boolean eliminarServicioAVisitantes(String servicio) {
		if (serviciosAVisitantes.contains(servicio)) {
			serviciosAVisitantes.remove(servicio);
			return true;
		}else {
			return false;
		}
	}


	
}
