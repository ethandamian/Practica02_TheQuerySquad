package zoologico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Clases.Animal;
import Clases.Bioma;

/**
 * Clase para manipular la informacion de un bioma
 */
public class ManipularBioma extends ManipularZoologico {

	String path = "archivosCSV/Bioma.csv";

	/**
	 * Método para hacer consulta de un bioma de archivo csv.
	 * 
	 * @param id Id del bioma a consultar.
	 * @return Regresa el bioma consultado. Null si no se encontró con ese id.
	 */
	public Bioma leerBioma(String id) {
		String[] values = this.leer(id, path);
		if (values == null) {
			return null;
		}

		String tipo = values[1];
		String servicio = values[2];
		int numJaulaas = Integer.valueOf(values[3]);
		int numVeterinarios = Integer.valueOf(values[4]);
		int numAnimales = Integer.valueOf(values[5]);
		int numCuidadores = Integer.valueOf(values[6]);	

		Bioma bioma = new Bioma(numCuidadores, tipo, servicio, numJaulaas, numVeterinarios, numAnimales, numCuidadores);
		return bioma;
	}
	
	
	/**
     * Metodo que devuelve todos los biomas en el arvhico .csv en una lista
     * @return todos los biomas en el arvhico .csv en una lista
     */
    public List<Bioma> devolverListaBiomasEnArchivo(){
    	List<String []> listaBiomas= devolverListaEntidadesEnTabla(path);
    	List<Bioma> listaBiomasParseados = new ArrayList<Bioma>();
    	Bioma bioma;
    	for (String[] strings : listaBiomas) {
			int id =Integer.valueOf(strings[0]) ;
			String tipo = strings[1];
			int numJaula = 0;
			try {
			    numJaula = Integer.valueOf(strings[3]);
			} catch (NumberFormatException e) {
			    // Maneja el caso en el que no puedas convertir la cadena en un número.
			    // Puedes asignar un valor por defecto o tomar otra acción adecuada.
			    numJaula = 0; // Por ejemplo, asignar un valor por defecto.
			}
			bioma = new Bioma(id, tipo, numJaula);
			listaBiomasParseados.add(bioma);
		}
    	return listaBiomasParseados;
    	
    	
    	
    }


	/**
	 * Método que elimina bioma.
	 * 
	 * @param id Bioma a eliminar.
	 * @return Verdadero si se eliminó, falso si no se eliminó.
	 */
	public boolean eliminar(String id) {
		return this.eliminar(id, path);
	}

	/**
	 * Método que inserta bioma.
	 * 
	 * @param bioma bioma a insertar.
	 * @return Verdadero si se insertó, falso si no se insertó.
	 */
	public boolean inserta(String entidad) {
		return this.inserta(entidad, path);
	}

	/**
	 * Funcion que editar bioma.
	 * 
	 * @param bioma bioma a insertar en lugar del anterior.
	 * @return Verdadero si se editó, falso si no se editó.
	 */
	public boolean editar(Bioma bioma, String id) {
		return this.editar(bioma.toStringNoId(), id, path);
	}
}
