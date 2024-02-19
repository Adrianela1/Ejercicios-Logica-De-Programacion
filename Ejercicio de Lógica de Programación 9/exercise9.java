import java.util.HashMap;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Ingrese una palabra en español: ");
            String palabraEspañol = scanner.nextLine();

            
            String traduccion = diccionario.get(palabraEspañol);

            if (traduccion != null) {
                
                System.out.println("La traducción al inglés es: " + traduccion);
            } else {
               
                System.out.println("La palabra no se encuentra en el diccionario.");
            }

            
            System.out.print("¿Desea traducir otra palabra? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break; 
            }
        }

        scanner.close();
    }
}
