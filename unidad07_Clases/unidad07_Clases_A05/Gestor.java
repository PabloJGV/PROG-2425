package unidad07_Clases_A05;

/**
 *
 * @author pablo
 */
public class Gestor {
    public String nombre; 
    private String telefono; 
    protected double importeMaximo;

    // Constructor con importe m�ximo por defecto
    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000.0);
    }

    // Constructor para personalizar el importe m�ximo
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    // Getter para obtener el tel�fono
    public String getTelefono() {
        return telefono;
    }

    // Getter para obtener el importe m�ximo (visible para clases vecinas)
    protected double getImporteMaximo() {
        return importeMaximo;
    }

    // Setter para modificar el importe m�ximo
    protected void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }
}
