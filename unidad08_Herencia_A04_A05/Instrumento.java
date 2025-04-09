/*
Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una
melodía (dentro de una misma octava).

• El metodo add() añade nuevas notas musicales.
• La clase también dispone del metodo abstracto interpretar() que, en cada subclase que herede de Instrumento,
  mostrará por consola las notas musicales según las interprete.
• Utilizar enumerados para definir las notas musicales.
 */

package Musica;

public abstract class Instrumento {
    public enum notas {
        Do, Re, Mi, Fa, Sol, La, Si;
    }

    public notas[] melodia = new notas[10];
    public int i = 0;

    public void add(notas nota) {
        if (i < melodia.length) {
            melodia[i] = nota;
            i++;
        } else {
            System.out.println("La melodía está llena, no se pueden añadir más notas.");
        }
    }

    public abstract void interpretar();
}
