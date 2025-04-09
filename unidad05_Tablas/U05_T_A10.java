package unidad05_Tablas;

import java.util.Arrays;

public class U05_T_A10 {
    public static void main(String[] args) {
        
        // Crear y llenar la tabla origen con las letras 'a' a 'j'
        char[] o = new char[10];
        for (int i = 0; i < o.length; i++) {
            o[i] = (char) ('a' + i);
        }
        
        // Crear la tabla destino
        char[] d = new char[10]; 
        
        // Mostrar las tablas antes de la copia
        System.out.println("Tabla origen: " + Arrays.toString(o));
        System.out.println("Tabla destino antes de copiar: " + Arrays.toString(d));
        
        // Usar arraycopy para copiar 5 elementos desde el �ndice 2 de origen a destino a partir del �ndice 3
        System.arraycopy(o, 2, d, 3, 5);
        
        // Mostrar las tablas despu�s de la copia
        System.out.println("Tabla destino despu�s de copiar: " + Arrays.toString(d));
    }
}
