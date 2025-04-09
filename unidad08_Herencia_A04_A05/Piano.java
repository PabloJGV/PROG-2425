package Musica;

public class Piano extends Instrumento {
    public void interpretar() {
        System.out.print("Melodía: ");

        for (int j = 0; j < i; j++) {
            System.out.print(melodia[j] + " ");
        }

        System.out.println();
    }
}