import java.util.Scanner;

public class RecaudarCaridad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personasAyudaron = 0;
        int dineroRecaudado = 0;
        String respuesta;
        System.out.println("¿Una ayudita? (si/no)");
        respuesta = scanner.nextLine();
        while (respuesta.equals("si")) {
            System.out.println("¿Cuánto quieres donar?");
            int donacion = scanner.nextInt();
            scanner.nextLine();
            personasAyudaron = personasAyudaron + 1;
            dineroRecaudado = dineroRecaudado + donacion;
            System.out.println("¿Una ayudita? (si/no)");
            respuesta = scanner.nextLine();
        }
        System.out.println("Te deprimes y te vas para tu casa.");
        System.out.println("Te ayudaron " + personasAyudaron + " personas.");
        System.out.println("Recaudaste " + dineroRecaudado + " euros.");
        scanner.close();
    }
}
