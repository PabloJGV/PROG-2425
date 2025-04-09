package unidad05_Tablas;

import java.util.Scanner;

public class U05_T_A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario cu�ntos n�meros desea introducir
        System.out.println("�Cu�ntos n�meros deseas introducir?");
        int cantidad = sc.nextInt();

        // Crear un array para almacenar los n�meros
        int num[] = new int[cantidad];

        // Introduce los n�meros por teclado
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el n�mero " + (i + 1) + ":");
            num[i] = sc.nextInt();
        }

        // Mostrar el n�mero contrario introducido
        System.out.println("Los n�meros en orden contrario son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
