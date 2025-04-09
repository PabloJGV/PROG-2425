package unidad07_Clases_A09;

/**
 *
 * @author pablo
 */
class Bombilla {
    private boolean encendida;
    private static boolean interruptorGeneral = true;

    public Bombilla() {
        this.encendida = false; // Por defecto, las bombillas est�n apagadas
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public boolean estaEncendida() {
        return encendida && interruptorGeneral;
    }

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }
}

