package zoologico;

import Clases.Veterinario;

public class ManipularVeterinario extends ManipularZoologico {

    String path = "src/archivosCSV/Veterinario.csv";
    
    public Veterinario leerVeterinario(String id) {
    	String[] values =  this.leer(id); //Lee el veterinario en el csv y regresa un String
    	
    	//EL metodo debe regresar un  Objeto veterinario con todos los valores que piden
    	//Si values devuelve un null entonces no encontró el id y tienes que regresar un null
    	return null;
    }
    
    public boolean eliminar(String id) {
    	return this.eliminar(id);
    }
    
    public boolean inserta(Veterinario veretrinario) {
    	
    	//El numero de telefono y los emails, debes separarlos y pasar toda la entidad en string y un RFC formato "nombre,blabla,blalbal,blalbla,blalba," (checa los archivos csv)
    	return this.inserta("RFC", "ENTIDADXD");//Valores de ejemplo
    }
    
    public boolean editar(String entidad, String id) {
    	return this.editar(entidad, id);
    }
    
}
