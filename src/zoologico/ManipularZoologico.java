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

public class ManipularZoologico {
	public String path;
	
	public ManipularZoologico(String path) {
		this.path = path;
	}
	
	public String[] leer(String id) {
		String line = "";
		try {
			 BufferedReader br = new BufferedReader(new FileReader(path));
			 
			 while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if(values[0].equals(id)) {
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
	
	public boolean eliminar(String id) {
		try {
			 BufferedReader br = new BufferedReader(new FileReader(path));
			 List<String> filas = new ArrayList<>();
			 int idEliminar = Integer.parseInt(id);
			 String linea;
			 int cont = 0;
			 boolean bandera = false;
			 while ((linea = br.readLine()) != null) {
				if(cont == 0) {
					cont++;
					filas.add(linea);
					continue;
				}
				String[] columnas = linea.split(",");
				if(columnas.length > 0 && Integer.parseInt(columnas[0]) != idEliminar){
					filas.add(linea);
				} else if (Integer.parseInt(columnas[0]) == idEliminar) {
					bandera = true;
				}
			}
			 
			 br.close();
			 if(bandera) {
				 BufferedWriter writer = new BufferedWriter(new FileWriter(path));
				 for(String fila : filas) {
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
	
	public boolean inserta(String entidad) {
	    String line = "";
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(path));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

	        // Variable para rastrear el valor máximo de ID
	        int maxID = 0;
	        int cont = 0;
	        // Leer el archivo para encontrar el valor máximo de ID
	        while ((line = br.readLine()) != null) {
	        	if(cont == 0) {
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

	public boolean inserta(String entidad, String id) {
		String line = "";
		try {
			 BufferedReader br = new BufferedReader(new FileReader(path));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			 
			 while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if(values[0].equals(id)) {
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

}

