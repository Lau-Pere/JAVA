import java.util.Scanner;

public class EstacionesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es la estación del año? (primavera, verano, otoño, invierno)");
        String estacion = scanner.nextLine();
        String estacionMinuscula = estacion.toLowerCase();
        switch (estacionMinuscula) {
            case "primavera":
                System.out.println("la primavera me alteraaa");
                break;
            case "verano":
                System.out.println("¡qué calor hace en verano!");
                break;
            case "otoño":
                System.out.println("las hojas caen en otoño");
                break;
            case "invierno":
                System.out.println("¡brrr, qué frío en invierno!");
                break;
            default:
                System.out.println("Eso no es una estación válida.");
        }
        scanner.close();
    }
}