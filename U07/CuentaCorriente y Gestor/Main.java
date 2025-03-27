package u07_a01;

public class Main {
    public static void main(String[] args) {
        // Creamos una cuenta corriente
        CuentaCorriente cuenta = new CuentaCorriente("65789542K", "Pablo Blanco");

        // Mostramos la información principal
        System.out.println("Información de la cuenta: ");
        cuenta.mostrarInformacion();

        // Crear un gestor
        Gestor gestor = new Gestor("Carlos Pérez", "612345678");

        // Asignamos el gestor a la cuenta
        cuenta.asignarGestor(gestor);

        // Mostramos la información después de asignar el gestor
        System.out.println("\nInformación de la cuenta después de asignar el gestor: ");
        cuenta.mostrarInformacion();

        // Intentar sacar dinero sin saldo
        System.out.println("\nIntentando retirar 50€");
        cuenta.sacarDinero(50);

        // Meter dinero en la cuenta
        System.out.println("\nAñadiendo 100€");
        cuenta.meterDinero(100);

        // Sacar dinero sin error
        System.out.println("\nRetirando 33€");
        cuenta.sacarDinero(33);

        // Intentar retirar más de lo permitido por el gestor
        System.out.println("\nIntentando retirar 12000€ (excediendo límite)");
        cuenta.sacarDinero(12000);

        // Mostrar el saldo final después de los movimientos
        System.out.println("\nInformación de la cuenta después de los movimientos: ");
        cuenta.mostrarInformacion();

        // Modificar el banco
        System.out.println("\nCambiando el banco a 'Banco del Futuro'");
        CuentaCorriente.setBanco("Banco del Futuro");

        // Crear una nueva cuenta para verificar que el banco es el mismo
        CuentaCorriente otraCuenta = new CuentaCorriente("12345678A", "Laura González");

        System.out.println("\nInformación de la nueva cuenta:");
        otraCuenta.mostrarInformacion();
    }
}