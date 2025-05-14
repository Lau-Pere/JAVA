import java.util.Scanner;

public class MediaEdadesPadres {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu madre:");
        String nombreMadre = scanner.nextLine();
        System.out.println("Introduce la edad de tu madre:");
        int edadMadre = scanner.nextInt();
        System.out.println("Introduce el nombre de tu padre:");
        String nombrePadre = scanner.nextLine();
        System.out.println("Introduce la edad de tu padre:");
        int edadPadre = scanner.nextInt();
        float mediaEdades = (float) (edadMadre + edadPadre) / 2;
        System.out.printf("Tu madre se llama %s y tiene %d años, y tu padre se llama %s y tiene %d años, y la media de sus edades es %.1f%n",
                          nombreMadre, edadMadre, nombrePadre, edadPadre, mediaEdades);
        scanner.close();
    }
}
