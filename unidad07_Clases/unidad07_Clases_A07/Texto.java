package unidad07_Clases_A07;

/**
 *
 * @author pablo
 */
import java.time.LocalDateTime;

public class Texto {
    private String cadena;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;

    // Constructor
    public Texto(int longitudMaxima) {
        this.cadena = "";
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDateTime.now();
        this.ultimaModificacion = LocalDateTime.now();
    }

    // M�todo para a�adir un car�cter al inicio
    public boolean a�adirCaracterInicio(char caracter) {
        if (cadena.length() + 1 <= longitudMaxima) {
            cadena = caracter + cadena;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // M�todo para a�adir un car�cter al final
    public boolean a�adirCaracterFin(char caracter) {
        if (cadena.length() + 1 <= longitudMaxima) {
            cadena = cadena + caracter;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // M�todo para a�adir una cadena al inicio
    public boolean a�adirCadenaInicio(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            cadena = texto + cadena;
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // M�todo para a�adir una cadena al final
    public boolean a�adirCadenaFin(String texto) {
        if (cadena.length() + texto.length() <= longitudMaxima) {
            cadena = cadena + texto; // A�ade la cadena al final
            actualizarUltimaModificacion();
            return true;
        }
        return false;
    }

    // M�todo para contar las vocales (may�sculas y min�sculas) en la cadena
    public int contarVocales() {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // M�todo para mostrar la informaci�n del texto
    public void mostrarInformacion() {
        System.out.println("Texto: " + cadena);
        System.out.println("Longitud m�xima permitida: " + longitudMaxima);
        System.out.println("Fecha de creaci�n: " + fechaCreacion);
        System.out.println("�ltima modificaci�n: " + ultimaModificacion);
        System.out.println("N�mero de vocales en el texto: " + contarVocales());
    }

    // M�todo privado para actualizar la fecha y hora de la �ltima modificaci�n
    private void actualizarUltimaModificacion() {
        this.ultimaModificacion = LocalDateTime.now();
    }
}