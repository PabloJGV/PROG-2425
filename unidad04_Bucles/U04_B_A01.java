package unidad04_Bucles;

import java.util.Scanner;

public class U04_B_A01 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); 
                int num;
                    
               //N�mero introducido por pantalla
                System.out.print("Introduce un n�mero (0 - SALIR): ");
                num = sc.nextInt();
                
                //El n�mero sea diferente de 0
                while ( num != 0) {
                        // N�mero  Par o Impar
                        if(num % 2 == 0){
                            System.out.println("El n�mero introducido es par : " + num );
                        } else {
                            System.out.println("El n�mero introducido es impar: "+ num );
                        }
                        
                        // N�mero  Positivo o Negativo
                        if(num > 0){
                            System.out.println("El n�mero introducido es positivo : " + num );
                        } else {
                            System.out.println("El n�mero introducido es negativo: "+ num );
                        }
                        
                        //C�lculo y muestro el cuadrado de num
                        int cuadrado = num * num;
                        System.out.println("El n�mero introducido" + num + " es " + cuadrado);
                        
                        //Introducir otro n�mero
                        System.out.println("El n�mero introducido n�mero  (0 - SALIR ): ");
                        num = sc.nextInt();
                }
                System.out.println("Se ha salido del programa...");
    }
}
