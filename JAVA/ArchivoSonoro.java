import java.util.Scanner;
public class ArchivoSonoro {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Elige un sonido (1-5):");
            System.out.println("1. Cohete");
            System.out.println("2. Coche");
            System.out.println("3. Moto");
            System.out.println("4. Campana");
            System.out.println("5. Gato");
            System.out.print("Opción: ");
            byte opcion = scanner.nextByte();
            switch (opcion) {
                case 1:
                    System.out.println("ziuuum!");
                    break;
                case 2:
                    System.out.println("vroom!");
                    break;
                case 3:
                    System.out.println("brrrmmm!");
                    break;
                case 4:
                    System.out.println("ding-dong!");
                    break;
                case 5:
                    System.out.println("miau!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println("¿Quieres escuchar otro? (sí/no)");
            respuesta = scanner.nextLine();
        } while (respuesta.equals("sí"));
        System.out.println("¡Hasta pronto!");
        scanner.close();
    }
}