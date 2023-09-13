package zoologico;

import Clases.Animal;

public class ManipularAnimal extends ManipularZoologico {

    String path = "src/archivosCSV/Animal.csv";

    public Animal leerAnimal(String id) {

        String[] values = this.leer(id);// lee el animal en el csv y regresa un String
        // El metodo debe regresar un Objeto animal con todos los valores indicados
        // Si values devuelve un null entonces no encontro el id asociado con el animal
        return null;
    }

    public boolean eliminar(String id) {
        return this.eliminar(id);
    }

    public boolean inserta(Animal animal) {
        // Asegurarse que al insertar un animal no este en la misma jaula que otro por
        // su numero de jaulaa
        return this.inserta(animal);

    }

    public boolean editar(Animal animal, String id) {
        // Del objeto animal pasado con el id obtener sus propiedades y editar
        return this.editar(animal, id);

    }
}