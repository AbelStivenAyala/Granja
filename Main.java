import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Granja granja = new Granja(); // Instancia de la granja

        // Registrando algunos animales
        Animal gallina1 = new Gallina(1, "Gallina1", 1.5, TipoAnimal.GALLINA, new Date(2019, 5, 15), "Suave");
        Animal cerdo1 = new Cerdo(2, "Cerdo1", 100, TipoAnimal.CERDO, new Date(2020, 8, 20), "Negro");
        Animal vaca1 = new Vaca(3, "Vaca1", 500, TipoAnimal.VACA, new Date(2015, 11, 5), "Negro y blanco");
        Animal gallina2 = new Gallina(4, "Gallina2", 1.7, TipoAnimal.GALLINA, new Date(2020, 6, 20), "duro");

        granja.registrarAnimal(gallina1);
        granja.registrarAnimal(cerdo1);
        granja.registrarAnimal(vaca1);
         granja.registrarAnimal(gallina2);
        
           System.out.println("Registro de los animales:");
        System.out.println("ID: " + gallina1.getId() + ", Nombre: " + gallina1.getNombre() + ", Peso: " + gallina1.getPeso() + ", Tipo: " + gallina1.getTipo() + ", Plumaje: " + ((Gallina) gallina1).getPlumaje());
        System.out.println("ID: " + cerdo1.getId() + ", Nombre: " + cerdo1.getNombre() + ", Peso: " + cerdo1.getPeso() + ", Tipo: " + cerdo1.getTipo() + ", Color: " + ((Cerdo) cerdo1).getColor());
        System.out.println("ID: " + vaca1.getId() + ", Nombre: " + vaca1.getNombre() + ", Peso: " + vaca1.getPeso() + ", Tipo: " + vaca1.getTipo() + ", Manchas: " + ((Vaca) vaca1).getManchas());
        System.out.println("ID: " + gallina2.getId() + ", Nombre: " + gallina2.getNombre() + ", Peso: " + gallina2.getPeso() + ", Tipo: " + gallina2.getTipo() + ", Plumaje: " + ((Gallina) gallina2).getPlumaje());

        System.out.println("-----------------------");
        // Contando animales
        
        granja.contarAnimales();
        
         System.out.println("-----------------------");
        // Mostrando la edad de cada animal en años
        gallina1.calcularEdad();
        cerdo1.calcularEdad();
        vaca1.calcularEdad();
        gallina2.calcularEdad();
    }
     }

