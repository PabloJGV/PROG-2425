package unidad05_Tablas;

import java.util.Arrays;

public class U05_T_A07 {
    public static void main(String[] args) {
        int[] apuesta = {6, 4, 3, 7, 9, 1};
        int[] ganadora = {5, 1, 2, 5, 3, 5};

        // Ordena la tabla ganadora para aplicar b�squedas binaria
        Arrays.sort(ganadora);

        // Llamar al m�todo comprobarAciertos y mostrar el resultado
        int aciertos = comprobarAciertos(apuesta, ganadora);
        System.out.println("N�mero de aciertos: " + aciertos);
    }

    public static int comprobarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;
        for (int numApuesta : apuesta) {
            // Usar b�squeda binaria para comprobar si el n�mero de la apuesta est� en la combinaci�n ganadora
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }
}

