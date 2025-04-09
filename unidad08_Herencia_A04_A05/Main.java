package Musica;

public class Main {
    public static void main(String[] args){
        Piano yamaha = new Piano() ;
        
        yamaha.add("Do");
        yamaha.add("Re");
        yamaha.add("Mi");
        yamaha.add("Fa");
        yamaha.add("Sol");
        
        yamaha.interpretar();

    }  
}
