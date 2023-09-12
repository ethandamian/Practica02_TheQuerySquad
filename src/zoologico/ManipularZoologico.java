package zoologico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipularZoologico {
	public String path;
	public String id;
	
	public ManipularZoologico(String path, String id) {
		this.path = path;
		this.id = id;
	}
	
	public String[] leer() {
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
	
	public boolean eliminar() {
		return true;
	}
	
	
	
	
}

