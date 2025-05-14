import java.util.Scanner;
public class ClasificarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        if (edad < 6 || edad > 120) {
            System.out.println("Error: La edad debe estar entre 6 y 120 años.");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Estás en primaria.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Estás en secundaria.");
        } else if (edad >= 18 && edad <= 24) {
            System.out.println("Estás en la universidad.");
        } else {
            System.out.println("Estás trabajando.");
        }
        scanner.close();
    }
}