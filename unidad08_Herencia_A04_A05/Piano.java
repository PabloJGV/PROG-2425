package Musica;
public class Piano extends Instrumento{

    @Override
    void interpretar(){
        for (Notas nota : melodia){
            System.out.println("Piano tocando la nota:" + nota);
        }
    }
}
