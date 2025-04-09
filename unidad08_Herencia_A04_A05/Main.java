package Musica;

public class Main {
    public static void main(String[] args) {
        Piano p = new Piano();

        p.add(Instrumento.notas.Mi);
        p.add(Instrumento.notas.Fa);
        p.add(Instrumento.notas.Sol);
        p.add(Instrumento.notas.Re);
        p.add(Instrumento.notas.Re);
        p.add(Instrumento.notas.Si);
        p.add(Instrumento.notas.Do);
        p.add(Instrumento.notas.Re);
        p.add(Instrumento.notas.Mi);
        p.add(Instrumento.notas.Mi);
        p.add(Instrumento.notas.Mi);

        p.interpretar();
    }
}
