package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A04 {
        public static int numMax(int  num1, int  num2){
                return (num1 >num2) ? num1 : num2;
        }
        
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                //Imprimir el primer n�mero introducido
                System.out.println("Introduce tu primer n�mero: ");
                int num1 = sc.nextInt();
                
                //Imprimir el primer n�mero introducido
                System.out.println("Introduce tu segundo n�mero: ");
                int num2 = sc.nextInt();
                
                //Imprimir por pantalla el numero m�s mayor 
                System.out.println("El n�mero m�ximo es: " + numMax(num1, num2) );
        }

}
