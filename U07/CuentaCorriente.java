package u07_a01;


public class CuentaCorriente {
    
    // Atributos de la cuenta corriente
    private String dni;
    private String nombre;
    private double saldo;

    // Constructor
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0; // El saldo inicial será 0
    }
    
    // Metodo para sacar el dinero
    public void sacarDinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + "€ de la cuenta.");
        }else{
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }    
    }
    
    // Metodo para meter dinero
    public void meterDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han metido: " + cantidad + "€ en la cuenta.");
    }
    
    // Metodo para mostrar la infromación de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular de la ccuenta: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + "€");
    }
}
