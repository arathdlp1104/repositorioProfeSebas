import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar?: ");
        int n = sc.nextInt();
        int pares = 0, impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

    }
}