package unidad04_Metodos;

import java.util.Scanner;

public class U04_M_A08 {
    // M�todo para encontrar el m�ximo de dos n�meros
    public static int numMax(int num1, int num2) {
        return (num1 >= num2) ? num1 : num2;
    }

    // M�todo para encontrar el m�ximo de tres n�meros
    public static int numMax(int num1, int num2, int num3) {
        return numMax(numMax(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar los n�meros para el m�todo que encuentra el m�ximo de dos n�meros
        System.out.println("Introduce el primer n�mero para comparar dos n�meros: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo n�mero para comparar dos n�meros: ");
        int num2 = sc.nextInt();
        System.out.println("El n�mero m�ximo entre dos es: " + numMax(num1, num2));
        
        // Solicitar los n�meros para el m�todo que encuentra el m�ximo de tres n�meros
        System.out.println("Introduce el primer n�mero para comparar tres n�meros: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el segundo n�mero para comparar tres n�meros: ");
        int num4 = sc.nextInt();
        System.out.println("Introduce el tercer n�mero para comparar tres n�meros: ");
        int num5 = sc.nextInt();
        System.out.println("El n�mero m�ximo entre tres es: " + numMax(num3, num4, num5));
    }
}
