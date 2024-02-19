import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String diaSemana;
        int horas, minutos;

        
        do {
            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
            diaSemana = scanner.nextLine().toLowerCase();
        } while (!esDiaSemanaValido(diaSemana));

        
        do {
            System.out.print("Ingrese la hora (0-23): ");
            horas = scanner.nextInt();
        } while (horas < 0 || horas > 23);

      
        do {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);

        
        int minutosRestantes = calcularMinutosRestantes(diaSemana, horas, minutos);

        
        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");

        scanner.close();
    }

    
    public static boolean esDiaSemanaValido(String diaSemana) {
        return diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles")
                || diaSemana.equals("jueves") || diaSemana.equals("viernes");
    }

    
    public static int calcularMinutosRestantes(String diaSemana, int horas, int minutos) {
        int minutosTotales = 0;
        switch (diaSemana) {
            case "lunes":
                minutosTotales += (24 - horas) * 60 + (60 - minutos);
                break;
            case "martes":
            case "miércoles":
            case "jueves":
                minutosTotales += ((4 - obtenerNumeroDia(diaSemana)) * 24 * 60) + (15 * 60 - horas * 60 - minutos);
                break;
            case "viernes":
                minutosTotales += (15 - horas) * 60 + (0 - minutos);
                break;
        }
        return minutosTotales;
    }


    public static int obtenerNumeroDia(String diaSemana) {
        switch (diaSemana) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            default:
                return -1;
        }
    }
}
