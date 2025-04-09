//3. Dise�ar un m�todo al que se le pase una cadena de caracteres y la devuelva invertida. Un ejemplo, la cadena �Hola mundo� quedar�a �odnum aloH�.

package unidad06_Cadenas;

public class U06_C_A03 {

    public static void main(String[] args) {
        // Ejemplo de cadena a invertir
        String frase = "Bienvenido a la clase 1�DAW";

        // Invertimos la cadena utilizando el m�todo invertirCadena
        String fraseInvertida = invertirCadena(frase);

        // Mostramos la cadena invertida
        System.out.println("La cadena invertida es: " + fraseInvertida);
    }

    // M�todo para invertir la cadena
    public static String invertirCadena(String cadena) {
        // StringBuilder permite manipular la cadena f�cilmente
        StringBuilder cadenaInvertida = new StringBuilder(cadena);

        // El m�todo reverse() invierte la cadena
        return cadenaInvertida.reverse().toString();
    }
}
