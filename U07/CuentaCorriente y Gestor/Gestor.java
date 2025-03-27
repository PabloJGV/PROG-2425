package u07_a01;

public class Gestor {
    private String nombre;
    private String telefono;
    private double importeMaximo;

    // Constructor
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 3000; // Límite predeterminado
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }
}