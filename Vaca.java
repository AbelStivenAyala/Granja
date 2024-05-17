import java.util.Date;

class Vaca extends Animal {
    private String manchas; // Variable específica para Vaca

    // Constructor
    public Vaca(int id, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento, String manchas) {
        super(id, nombre, peso, tipo, fechaNacimiento);
        this.manchas = manchas;
    }

    // Método get específico para Vaca
    public String getManchas() {
        return manchas;
    }
}
