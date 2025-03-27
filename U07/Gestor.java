package u07_a01;

// Clase Gestor
public class Gestor {
    public String nombre;
    private final String telefono;
    double importeMaximo;
   
    // Constructor con importe máximo opcional
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }
   
    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000); // Valor por defecto
    }
   
    // Método para obtener el teléfono
    public String getTelefono() {
        return telefono;
    }
}
