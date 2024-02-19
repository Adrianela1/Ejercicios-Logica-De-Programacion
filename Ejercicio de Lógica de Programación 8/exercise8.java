import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        System.out.println("Array original mostrando la posición del array más el valor:");
        mostrarArray(numeros);


        moverPrimosAlPrincipio(numeros);


        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        mostrarArray(numeros);

        scanner.close();
    }


    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void moverPrimosAlPrincipio(int[] array) {
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                int temp = array[i];
                array[i] = array[indice];
                array[indice] = temp;
                indice++;
            }
        }
    }
}
