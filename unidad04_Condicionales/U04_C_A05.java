package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A05 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //EJERCICO 05
        
        //Introduce dos n�meros
        System.out.println("Introduce el primer n�mero: ");
        int num051 = sc.nextInt() ;

        System.out.println("Introduce el segundo n�mero: ");
        int num052 = sc.nextInt() ;
        
        //Comprobar que n�mero es mayor
        if(num051> num052){
            System.out.println("El primer n�mero es el mayor");
        } else if (num052 >num051){
            System.out.println("El segundo n�mero es el mayor");
        } else {
            System.out.println("Ambos n�meros son iguales");
        }
    }
}