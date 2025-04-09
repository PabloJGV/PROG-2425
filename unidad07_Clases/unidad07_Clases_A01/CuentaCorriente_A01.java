package unidad07_Clases_A01;

/**
 *
 * @author pablo
 */
public class CuentaCorriente_A01 {
    private String dni;
    private String nombre;
    private double saldo;

    // Constructor: Crear cuenta con DNI y nombre del titular, saldo inicial ser� 0
    public CuentaCorriente_A01(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0; // Saldo inicial es 0
    }

    // M�todo para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar la operaci�n.");
            return false; // Operaci�n no realizada
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
            return true; // Operaci�n realizada con �xito
        }
    }

    // M�todo para ingresar dinero
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Has ingresado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
    }

    // M�todo para mostrar informaci�n
    public void mostrarInformacion() {
        System.out.println("Informaci�n de la cuenta:");
        System.out.println("DNI: " + dni);
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo + " euros.");
    }
}