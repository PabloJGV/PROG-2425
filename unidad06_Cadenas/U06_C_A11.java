//11.- (U06-A11.java) Dise�ar un algoritmo que lea del teclado una frase e indique, para cada letra que aparece en la frase, cu�ntas veces se repite. 
//Se consideran iguales las letras may�sculas y las min�sculas para realizar la cuenta.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A11 {
    public static void main(String[] args) {
        // Crear un esc�ner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        // Convertir la frase a min�sculas para hacer la comparaci�n insensible a may�sculas y min�sculas
        frase = frase.toLowerCase();

        // Crear un array para contar las letras (26 letras del alfabeto)
        int[] contadorLetras = new int[26];

        // Recorrer cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Si el caracter es una letra, contar su aparici�n
            if (c >= 'a' && c <= 'z') {
                contadorLetras[c - 'a']++;
            }
        }

        // Mostrar el resultado
        System.out.println("Resultado:");
        for (int i = 0; i < 26; i++) {
            if (contadorLetras[i] > 0) {
                char letra = (char) (i + 'a');
                System.out.println(letra + ": " + contadorLetras[i] + (contadorLetras[i] > 1 ? " veces" : " vez"));
            }
        }
    }
}
