package unidad05_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class U05_T_A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar tama�o de la tabla
        System.out.print("Introduce el tama�o de la tabla: ");
        int tama�o = sc.nextInt();
        
        int[] tabla = new int[tama�o];
        
        // Solicitar los valores de la tabla
        System.out.println("Introduce los " + tama�o + " valores para la tabla:");
        for (int i = 0; i < tama�o; i++) {
            tabla[i] = sc.nextInt();
        }
        
        // Crear una copia de la tabla con 5 elementos adicionales
        int[] copia = Arrays.copyOf(tabla, tama�o + 5);
        
        // Mostrar la tabla original y la copia
        System.out.println("Tabla original: " + Arrays.toString(tabla));
        System.out.println("Copia de la tabla (con 5 elementos adicionales): " + Arrays.toString(copia));
    }
}
