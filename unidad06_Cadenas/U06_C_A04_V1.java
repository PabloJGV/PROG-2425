//4. Dise�ar el juego �Acierta la contrase�a�. 
//La mec�nica del juego es la siguiente: el primer jugador introduce la contrase�a; a continuaci�n, el segundo jugador debe teclear palabras hasta que la acierte.

// Version_1 -> El programa indicar� si la palabra introducida es mayor o menor alfab�ticamente que la contrase�a.

package unidad06_Cadenas;

import java.util.Scanner;

public class U06_C_A04_V1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1, introduce la contrase�a: ");
        String password = sc.nextLine();

        System.out.println("Jugador 2, intenta adivinar la contrase�a.");

        String intentos;
        do {
            System.out.print("Introduce una palabra: ");
            intentos = sc.nextLine();

            if (intentos.compareTo(password) < 0) {
                System.out.println("La palabra introducida es menor alfab�ticamente que la contrase�a.");
            } else if (intentos.compareTo(password) > 0) {
                System.out.println("La palabra introducida es mayor alfab�ticamente que la contrase�a.");
            }

        } while (!intentos.equals(password));

        System.out.println("�Has acertado la contrase�a!");
    }
}
