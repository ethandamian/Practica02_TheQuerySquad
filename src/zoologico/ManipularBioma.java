package zoologico;

import Clases.Bioma;
import Clases.Veterinario;

public class ManipularBioma extends ManipularZoologico {

	String path = "src/archivosCSV/Bioma.csv";

	public Bioma leerBioma(String id) {
    	String[] values =  this.leer(id); //Lee el veterinario en el csv y regresa un String
    	
    	//EL metodo debe regresar un  Objeto Bioma con todos los valores que piden
    	//Si values devuelve un null entonces no encontró el id y tienes que regresar un null
    	return null;
    }
    
    public boolean eliminar(String id) {
    	return this.eliminar(id);
    }
    
    public boolean inserta( String entidad) {
    	return this.inserta(entidad);
    }
    
    public boolean editar(String entidad, String id) {
    	return this.editar(entidad, id);
    }
}
