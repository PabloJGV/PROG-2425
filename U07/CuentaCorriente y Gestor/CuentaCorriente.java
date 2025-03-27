package u07_a01;

public class CuentaCorriente {
   
    // Atributos de la cuenta corriente
    private String dni;
    private String nombre;
    private double saldo;
    private Gestor gestor;  
    private static String banco = "Banco Genérico"; // Atributo compartido por todas las cuentas

    // Constructor
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
        this.gestor = null;
    }

    // Método para asignar un gestor
    public void asignarGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // Método para sacar el dinero con validación del gestor
    public void sacarDinero(double cantidad) {
        if (gestor != null && cantidad > gestor.getImporteMaximo()) {
            System.out.println("No puedes retirar más de " + gestor.getImporteMaximo() + "€ en una sola operación.");
            return;
        }

        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + "€ de la cuenta.");
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }    
    }

    // Método para meter dinero
    public void meterDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han metido: " + cantidad + "€ en la cuenta.");
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular de la cuenta: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + "€");
        System.out.println("Banco: " + banco);
        if (gestor != null) {
            System.out.println("Gestor asignado: " + gestor.getNombre());
            System.out.println("Teléfono del gestor: " + gestor.getTelefono());
        } else {
            System.out.println("No hay gestor asignado.");
        }
    }

    // Métodos estáticos para manejar el nombre del banco
    public static void setBanco(String nuevoBanco) {
        banco = nuevoBanco;
    }

    public static String getBanco() {
        return banco;
    }
}