//1. Introducir por teclado dos frases e indicar cu�l de ellas es la m�s corta, es decir, la que contiene menos caracteres.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducci�n de las frases por teclado
        System.out.println("Introduce la primera frase:");
        String primeraFrase = sc.nextLine();
        System.out.println("Introduce la segunda frase:");
        String segndaFrase= sc.nextLine();

        // Comparaci�n de las longitudes de las frases
        if (primeraFrase .length() < segndaFrase.length()) {
            System.out.println("La primera frase es la m�s corta.");
        } else if (primeraFrase .length() > segndaFrase.length()) {
            System.out.println("La segunda frase es la m�s corta.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
}
