package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A03 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 03
        
        //Introduce dos n�meros
        System.out.println("Introduce el primer n�mero: ");
        int num031 = sc.nextInt();
        
        System.out.println("Introduce el segundo n�mero: ");
        int num032 = sc.nextInt();
        
        //Comprobar que n�mero es mayor
        
        //OPCION 01
       int num031MayorNum032 = num031 > num032 ? num031 : num032;
        System.out.println("Numero mayor: " + num031MayorNum032);
        
       //OPCION 02
       if (num031 >num032) {
            System.out.println("El primer n�mero mayor" );
        }else if (num032 >num031) {
            System.out.println("El segundo n�mero mayor");
        }else {
            System.out.println("Has introducido dos n�meros diferentes");
        }
        
        //Mostrar el n�mero mayor 
        System.out.println("Numero mayor: " + num031MayorNum032);
    }
}