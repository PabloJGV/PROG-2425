package unidad08_Herencia_A01_A02_A03;

/**
 *
 * @author pablo
 */
public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(23, 59);
        System.out.println("Hora inicial: " + hora);
        hora.inc();
        System.out.println("Hora despu�s de incremento: " + hora);

        HoraExacta horaExacta = new HoraExacta(23, 59, 59);
        System.out.println("Hora exacta inicial: " + horaExacta);
        horaExacta.inc();
        System.out.println("Hora exacta despu�s de incremento: " + horaExacta);

        HoraExacta otraHora = new HoraExacta(0, 0, 0);
        System.out.println("�Son iguales las horas? " + horaExacta.equals(otraHora));
    }
}
