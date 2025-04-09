package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //EJERCICIO 07
        
        //Introduce un numero entre el 0 y 99.999
        System.out.println("Introdce un n�mero entre 0 y 99.999: ");
        int num071 = sc.nextInt();
        
        //Comprabar que el numero asignado entre 0 y 99.999
        if (num071 >= 0 && num071 <= 99999) {
            int numCifras;

            // N�mero de cifras.
            if (num071 == 0) {
                numCifras = 1;
            } 
            // N�meros del 1 al 9
            else if (num071 < 10) {
                numCifras = 1; 
            } 
            // N�meros del 10 al 99
            else if (num071 < 100) {
                numCifras = 2;
            } 
            // N�meros del 100 al 999
            else if (num071 < 1000) {
                numCifras = 3;
            }
            // N�meros del 1000 al 9999
            else if (num071 < 10000) {
                numCifras = 4;
            }
            // N�meros del 10000 al 99999
            else {
                numCifras = 5;
            }
            
                System.out.println("Las cifras del n�mero introducido: " + numCifras);
            } else {
                System.out.println("El n�mero que has introducido no est� entre 0 y 99.999");
        }
    }
}