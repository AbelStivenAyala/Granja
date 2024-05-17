import java.util.Date;

class Gallina extends Animal {
    private String plumaje; // Variable específica para Gallina

    // Constructor
    public Gallina(int id, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento, String plumaje) {
        super(id, nombre, peso, tipo, fechaNacimiento);
        this.plumaje = plumaje;
    }

    // Método get específico para Gallina
    public String getPlumaje() {
        return plumaje;
    }

    }

