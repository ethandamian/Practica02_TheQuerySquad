package zoologico;

import java.util.ArrayList;
import java.util.Arrays;

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
		ArrayList<String> serviciosAVisitantes = new ArrayList<String>(
				Arrays.asList(values[7].substring(1, values[7].length() - 2).split(":")));

		Bioma bioma = new Bioma(numCuidadores, tipo, servicio, numJaulaas, numVeterinarios, numAnimales, numCuidadores,
				serviciosAVisitantes);
		return bioma;
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
