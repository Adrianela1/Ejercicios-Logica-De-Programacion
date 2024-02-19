import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("árbol", "tree");
        diccionario.put("jugar", "play");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("mesa", "table");
        

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Bienvenido al juego de traducción!");

        for (int i = 0; i < 5; i++) {
           
            Object[] keys = diccionario.keySet().toArray();
            String palabraEspañol = (String) keys[random.nextInt(keys.length)];
            String traduccionCorrecta = diccionario.get(palabraEspañol);

            
            System.out.print("¿Cuál es la traducción de \"" + palabraEspañol + "\" al inglés? ");
            String traduccionUsuario = scanner.nextLine();

            
            if (traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

       
        System.out.println("\nResumen:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }
}
