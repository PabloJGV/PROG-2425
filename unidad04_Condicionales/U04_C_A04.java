package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A04 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 04
        
        //Introduce dos n�meros
        System.out.println("Introduce el primer n�mero: ");
        int num041 = sc.nextInt() ;

        System.out.println("Introduce el segundo n�mero: ");
        int num042 = sc.nextInt() ;
        
        //Comprobar que n�mero es mayor
        if(num041 > num042 ){
            System.out.println("Los n�meros en orden decrectiente: " + num041 + "," + num042);
        } else {
             System.out.println("Los n�meros en orden decrectiente: " + num042 + "," + num041);
        }
    }
}