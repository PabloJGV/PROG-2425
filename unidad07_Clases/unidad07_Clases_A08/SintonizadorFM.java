package unidad07_Clases_A08;

/**
 *
 * @author pablo
 */
public class SintonizadorFM {
    private double frecuencia;

    // Constructor por defecto
    public SintonizadorFM() {
        this.frecuencia = 80.0;
    }

    // Constructor con frecuencia inicial
    public SintonizadorFM(double frecuenciaInicial) {
        if (frecuenciaInicial >= 80.0 && frecuenciaInicial <= 108.0) {
            this.frecuencia = frecuenciaInicial;
        } else {
            this.frecuencia = 80.0;
        }
    }

    // M�todo para subir la frecuencia
    public void subirFrecuencia() {
        frecuencia += 0.5;
        if (frecuencia > 108.0) {
            frecuencia = 80.0;
        }
    }

    // M�todo para bajar la frecuencia
    public void bajarFrecuencia() {
        frecuencia -= 0.5;
        if (frecuencia < 80.0) {
            frecuencia = 108.0;
        }
    }

    // M�todo para mostrar la frecuencia actual
    public void mostrarFrecuencia() {
        System.out.println("Frecuencia actual: " + frecuencia + " MHz");
    }
}
