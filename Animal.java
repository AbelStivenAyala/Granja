import java.util.Date;

class Animal {
    private int id;
    private String nombre;
    private double peso;
    private TipoAnimal tipo;
    private Date fechaNacimiento;

    // Constructor
    public Animal(int id, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad en años del animal
    public void calcularEdad() {
        int diaActual = 9;
        int mesActual = 4;
        int añoActual = 2024;

        int diferenciaAnios = añoActual - fechaNacimiento.getYear();
        if (mesActual < fechaNacimiento.getMonth() || 
            (mesActual == fechaNacimiento.getMonth() && diaActual < fechaNacimiento.getDate())) {
            diferenciaAnios--;
        }
        
        System.out.println("La edad de " + nombre + " es: " + diferenciaAnios + " años.");
    }

    // Métodos get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}

