import java.util.Scanner;

public class EntradaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Por favor, introduce tu apellido:");
        String apellido = scanner.nextLine();
        System.out.println("Por favor, introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Te llamas " + nombre + " " + apellido + " y tienes " + edad + " años. Bienvenid@ a Ironhack!");
        System.out.println("Por favor, introduce tu posición de entrada (número entero):");
        int posicion = scanner.nextInt();
        System.out.println("En el puesto " + posicion + ", está " + nombre + " " + apellido + " con " + edad + " años");
        scanner.close();
    }
}