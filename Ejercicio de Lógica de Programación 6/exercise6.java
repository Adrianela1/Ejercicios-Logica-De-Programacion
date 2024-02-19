import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = scanner.nextLine();

        
        String alReves = reverseString(palabra);

        
        System.out.println("Texto al revés: " + alReves);

       
        scanner.close();
    }

    // Función para invertir una cadena
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
