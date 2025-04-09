package unidad05_Tablas;

public class U05_T_A14 {
    public static void main(String[] args) {
        // Tabla original con valores predeterminados
        int[] t = {1, 5, 3, 9, 2, 8};
        int valor = 5;
        
        // Llamada al m�todo para eliminar los valores mayores que el valor dado
        int[] resultado = eliminarMayores(t, valor);
        
        // Imprimir el resultado
        System.out.println("Tabla tras la eliminaci�n: ");
        for (int i : resultado) {
            System.out.print(i + " ");
        }
    }

    public static int[] eliminarMayores(int[] t, int valor) {
        // Contar cu�ntos elementos son menores o iguales al valor dado
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= valor) {
                contador++;
            }
        }
        
        // Crear una nueva tabla para almacenar los elementos v�lidos
        int[] nuevaTabla = new int[contador];
        
        // Copiar los elementos v�lidos a la nueva tabla
        int indice = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= valor) {
                nuevaTabla[indice++] = t[i];
            }
        }
        
        // Devolver la nueva tabla
        return nuevaTabla;
    }
}