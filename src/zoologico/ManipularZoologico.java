package zoologico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * Clase padre para la manipulación de las entidades en un zoologico.
 * Contiene operaciones CRUD hacía un archivo csv.
 */
public class ManipularZoologico {
	// public String path;

	/**
	 * Operación de consulta.
	 * 
	 * @param id   id de la clase solicitada
	 * @param path Ruta del archivo csv.
	 * @return Regresa una lista con los datos de la entidad solicitada. Regresa
	 *         null si no se encontró.
	 */
	public String[] leer(String id, String path) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if (values[0].equals(id)) {
					br.close();
					return values;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Devuelve una lista de arreglos con todas las entidades en un archivo
	 * @param path
	 * @return lista de arreglos con todas las entidades en un archivo
	 */
	public List<String []> devolverListaEntidadesEnTabla(String path) {
		List<String []> listaEntidadeStrings = new ArrayList<>();
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				listaEntidadeStrings.add(values);
			}
			
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaEntidadeStrings;
	}
	

	/**
	 * Operación de eliminación.
	 * 
	 * @param id   id de la entidad a eliminar
	 * @param path Ruta del archivo csv.
	 * @return Regresa verdadero si se eliminó la entidad. Falso si no se eliminó.
	 */
	public boolean eliminar(String id, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			List<String> filas = new ArrayList<>();
			int idEliminar = Integer.parseInt(id);
			String linea;
			int cont = 0;
			boolean bandera = false;
			while ((linea = br.readLine()) != null) {
				if (cont == 0) {
					cont++;
					filas.add(linea);
					continue;
				}
				String[] columnas = linea.split(",");
				if (columnas.length > 0 && Integer.parseInt(columnas[0]) != idEliminar) {
					filas.add(linea);
				} else if (Integer.parseInt(columnas[0]) == idEliminar) {
					bandera = true;
				}
			}

			br.close();
			if (bandera) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(path));
				for (String fila : filas) {
					writer.write(fila);
					writer.newLine();
				}
				writer.close();
				return bandera;
			}
			return bandera;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Operación de eliminación.
	 * 
	 * @param id   id de la entidad a eliminar
	 * @param path Ruta del archivo csv.
	 * @return Regresa verdadero si se eliminó la entidad. Falso si no se eliminó.
	 */
	public boolean eliminarTrabajador(String id, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			List<String> filas = new ArrayList<>();
			String idEliminar = id;
			String linea;
			int cont = 0;
			boolean bandera = false;
			while ((linea = br.readLine()) != null) {
				if (cont == 0) {
					cont++;
					filas.add(linea);
					continue;
				}
				String[] columnas = linea.split(",");
				if (columnas.length > 0 && !( columnas[0].equals(idEliminar))) {
					filas.add(linea);
				} else if (columnas[0].equals(idEliminar) ) {
					bandera = true;
				}
			}

			br.close();
			if (bandera) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(path));
				for (String fila : filas) {
					writer.write(fila);
					writer.newLine();
				}
				writer.close();
				return bandera;
			}
			return bandera;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	

	/**
	 * Operación de inserción de entidad en archivo csv.
	 * 
	 * @param entidad Entidad que se desea insertar.
	 * @param path    Ruta del archivo csv.
	 * @return Regresa verdadero si fue posible la inserción. Falso si no se
	 *         realizó.
	 */
	public boolean inserta(String entidad, String path) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

			// Variable para rastrear el valor máximo de ID
			int maxID = 0;
			int cont = 0;
			// Leer el archivo para encontrar el valor máximo de ID
			while ((line = br.readLine()) != null) {
				if (cont == 0) {
					cont++;
					continue;
				}
				String[] values = line.split(",");
				int currentID = Integer.parseInt(values[0]);
				if (currentID > maxID) {
					maxID = currentID;
				}
			}

			// Incrementar el valor máximo de ID para la nueva entidad
			int nuevoID = maxID + 1;

			// Escribir la nueva entidad en el archivo CSV
			bw.newLine();
			bw.write(nuevoID + "," + entidad);
			bw.close();
			br.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Operación de inserción de entidad con id en archivo csv.
	 * 
	 * @param entidad Entidad que se desea insertar.
	 * @param id      Id de la entidad.
	 * @param path    Ruta del archivo csv.
	 * @return Regresa verdadero si fue posible la inserción. Falso si no se
	 *         realizó.
	 */
	public boolean inserta(String entidad, String id, String path) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if (values[0].equals(id)) {
					br.close();
					return false;
				}
			}

			bw.newLine();
			bw.write(id + "," + entidad);
			bw.close();
			br.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Operación de edición de entidad en archivo csv.
	 * 
	 * @param entidad Entidad que se desea insertar.
	 * @param id      Id de la entidad.
	 * @param path    Ruta del archivo csv.
	 * @return Regresa verdadero si fue posible la edición. Falso si no fue posible.
	 */
	public boolean editar(String entidad, String id, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			List<String> filas = new ArrayList<>();// Almacena las lineas del archivo
			String linea;
			boolean encontrado = false;

			while ((linea = br.readLine()) != null) {
				String[] columnas = linea.split(",");
				if (columnas.length > 0 && columnas[0].equals(id)) {
					// Reemplaza la entidad correspondiente
					filas.add(id + "," + entidad);
					encontrado = true;
				} else {
					filas.add(linea);// Se agrega la linea original a la lista "filas sin modificaciones"
				}
			}

			br.close();

			if (encontrado) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(path));// Sobreescribe el archivo con las
																					// lineas actualizadas
				for (String fila : filas) {
					writer.write(fila);
					writer.newLine();
				}
				writer.close();
				return true;
			} else {
				// El ID no se encontró en el archivo CSV
				return false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
