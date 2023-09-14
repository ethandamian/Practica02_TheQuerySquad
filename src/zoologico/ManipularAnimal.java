package zoologico;

import java.io.BufferedReader;
import java.io.FileReader;

import Clases.Animal;

public class ManipularAnimal extends ManipularZoologico {

    String path = "src/archivosCSV/Animal.csv";

    /**
     * Método para hacer consulta de un animal de archivo csv.
     * 
     * @param id Id del animal a consultar.
     * @return Regresa el animal consultado. Null si no se encontró con ese id.
     */
    public Animal leerAnimal(String id) {
        String[] values = this.leer(id, path);
        if (values == null) {
            return null;
        }

        String nombre = values[1];
        String especie = values[2];
        float pesoKg = Float.valueOf(values[3].replace("kg", ""));
        float alturaCm = Float.valueOf(values[4].replace("cm", ""));
        String sexo = values[5];
        Integer numJaula = Integer.valueOf(values[6]);
        String alimentacion = values[7];
        String indicacionesMedicas = values[8];

        Animal animal = new Animal(nombre, especie, pesoKg, alturaCm, sexo, numJaula, alimentacion, indicacionesMedicas,
                Integer.valueOf(id));
        return animal;
    }

    /**
     * Método que elimina animal.
     * 
     * @param id Id del animal a eliminar.
     * @return Verdadero si se eliminó, falso si no se eliminó.
     */
    public boolean eliminar(String id) {
        return this.eliminar(id, path);
    }

    /**
     * Método que inserta animal.
     * 
     * @param animal Animal a insertar.
     * @return Verdadero si se insertó, falso si no se insertó.
     */
    public boolean inserta(Animal animal) {
        // Validación de no estar en misma jaula.
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); // Skip Headers

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int currentCage = Integer.parseInt(values[6]);
                if (currentCage == animal.getNumJaula()) {
                    System.out.println("Ya hay un animal en esa jaula");
                    return false;
                }
            }

            br.close();
            return this.inserta(animal.toStringNoId(), path);

        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }

    /**
     * Funcion que editar animal.
     * 
     * @param animal Animal a insertar en lugar del anterior.
     * @return Verdadero si se editó, falso si no se editó.
     */
    public boolean editar(Animal animal, String id) {
        // Del objeto animal pasado con el id obtener sus propiedades y editar
        return this.editar(animal.toStringNoId(), id, path);

    }
}