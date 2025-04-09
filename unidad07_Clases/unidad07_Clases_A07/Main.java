package unidad07_Clases_A07;

/**
 *
 * @author pablo
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Texto con una longitud m�xima de 20 caracteres
        Texto texto = new Texto(20);

        // A�adir un car�cter al final
        texto.a�adirCaracterFin('A');
        
        // A�adir un car�cter al principio
        texto.a�adirCaracterInicio('B');

        // A�adir una cadena al final
        texto.a�adirCadenaFin("CD");

        // A�adir una cadena al principio
        texto.a�adirCadenaInicio("Hola");

        // Mostrar la informaci�n del texto
        texto.mostrarInformacion();

        // Intentar a�adir una cadena que excede la longitud m�xima
        boolean a�adido = texto.a�adirCadenaFin("12345678901234567890"); // Excede el tama�o
        if (!a�adido) {
            System.out.println("No se pudo a�adir la cadena porque excede el tama�o m�ximo.");
        }

        // Contar las vocales y mostrar el resultado
        System.out.println("N�mero de vocales: " + texto.contarVocales());
    }
}
