package unidad07_Clases_A01;

/**
 *
 * @author pablo
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva cuenta corriente con DNI y nombre del titular
        CuentaCorriente_A01 cuenta = new CuentaCorriente_A01("12345678A", "Loren");

        // Mostrar informaci�n inicial de la cuenta
        cuenta.mostrarInformacion();

        // Ingresar dinero a la cuenta
        cuenta.ingresarDinero(5000);
        
        // Intentar sacar una cantidad v�lida
        cuenta.sacarDinero(2000);
        
        // Intentar sacar una cantidad mayor al saldo disponible
        cuenta.sacarDinero(4000);
        
        // Mostrar informaci�n final de la cuenta
        cuenta.mostrarInformacion();
    }
}