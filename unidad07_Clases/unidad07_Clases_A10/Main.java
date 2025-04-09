package unidad07_Clases_A10;

/**
 *
 * @author pablo
 */
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Maquinista maquinista = new Maquinista("Juan P�rez", "12345678A", 2500.0, "Senior");
        Mecanico mecanico = new Mecanico("Carlos Garc�a", "654321987", "Hidr�ulica");
        JefeEstacion jefeEstacion = new JefeEstacion("Ana L�pez", "98765432B", new Date());

        Locomotora locomotora = new Locomotora("ABC123", 1500.0, 2010, mecanico);

        Vagon vagon1 = new Vagon(1, 10000.0, 5000.0, "Electrodom�sticos");
        Vagon vagon2 = new Vagon(2, 12000.0, 6000.0, "Alimentos");

        Tren tren = new Tren(locomotora, maquinista);

        tren.agregarVagon(vagon1);
        tren.agregarVagon(vagon2);

        System.out.println("Tren creado con la locomotora: " + tren.getLocomotora().getMatricula());
        System.out.println("Maquinista responsable: " + tren.getMaquinistaResponsable().getNombre());
        System.out.println("N�mero de vagones en el tren: " + tren.getVagones().length);

        for (Vagon vagon : tren.getVagones()) {
            if (vagon != null) {
                System.out.println("Vag�n n�mero: " + vagon.getNumero());
                System.out.println("Carga m�xima: " + vagon.getCargaMaxima() + " kg");
                System.out.println("Carga actual: " + vagon.getCargaActual() + " kg");
                System.out.println("Tipo de mercanc�a: " + vagon.getTipoMercancia());
                System.out.println("-----");
            }
        }

        System.out.println("Jefe de estaci�n: " + jefeEstacion.getNombre());
        System.out.println("Fecha de nombramiento: " + jefeEstacion.getFechaNombramiento());
    }
}