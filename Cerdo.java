import java.util.Date;

class Cerdo extends Animal {
    private String color; // Variable específica para Cerdo

    // Constructor
    public Cerdo(int id, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento, String color) {
        super(id, nombre, peso, tipo, fechaNacimiento);
        this.color = color;
    }

    // Método get específico para Cerdo
    public String getColor() {
        return color;
    }
   
}
