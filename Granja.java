class Granja {
    private int gallinas;
    private int vacas;
    private int cerdos;

    // Método para registrar un animal en la granja
    public void registrarAnimal(Animal animal) {
        switch (animal.getTipo()) {
            case GALLINA:
                gallinas++;
                break;
            case VACA:
                vacas++;
                break;
            case CERDO:
                cerdos++;
                break;
            default:
                System.out.println("Tipo de animal no válido");
        }
    }
     public void contarAnimales() {
        System.out.println("Cantidad de gallinas: " + gallinas);
        System.out.println("Cantidad de vacas: " + vacas);
        System.out.println("Cantidad de cerdos: " + cerdos);
    }
}