import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar?: ");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);

        if (promedio > 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }


    }
}