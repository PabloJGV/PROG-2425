package unidad04_Bucles;

public class U04_B_A10 {
        public static void main(String[] args){
                int suma = 0;
                int numImpar =10;
                
                System.out.println("Los n�meros impares: " + numImpar);
                for (int i = 0;  i < numImpar;  i++) {
                        int impar =2 * i + 1;                        
                        System.out.println(impar);
                        suma += impar;
                }
                System.out.println("La suma de los 10 primeros n�meros impares : " + suma);
        }
}