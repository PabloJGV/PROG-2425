package unidad04_Condicionales;

import java.util.Scanner;

public class U04_C_A02 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
        //EJERCICIO 02

       //Introduce dos n�meros
        System.out.println("Introduce el primer n�mero: ");
        int num021 = sc.nextInt();

        System.out.println("Introduce el segundo n�mero: ");
        int num022 = sc.nextInt();

        //Comprobar si los numeros son igual o diferente
        if(num021  == num022){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        } 
    }  
}