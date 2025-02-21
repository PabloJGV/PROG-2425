package u07_a01;

public class Main {
    public static void main(String[] args) {
        // Creamos CuentaCorriente
        CuentaCorriente cuenta = new CuentaCorriente ("65789542K", "Pablo Blanco");
        
        // Mostramos la información principal
        System.out.println("Información de la cuenta: ");
        cuenta.mostrarInformacion();
       
        // Mensaje de error al intentar sacar dinero de la cuenta
        System.out.println("\nIntentando retirar 50€");
        cuenta.sacarDinero(50);
        
        // Meter dinero en la cuenta
        System.out.println("\nAñadiendo 100€");
        cuenta.meterDinero(100);
        
        // Sacar dinero sin error
        System.out.println("\nRetirando 33€");
        cuenta.sacarDinero(33);
        
        // Mostrar el saldo final después de añadir
        System.out.println("\nInformacion de la cuenta despues de los movimientos: ");
        cuenta.mostrarInformacion();

        System.out.println(cuentaNueva.saldo);
        System.out.println(cuentanueva.dni);
        System.out.println(cuentaNueva.nombre);
              
        
        
        
        
    }
}
