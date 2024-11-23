import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        boolean tieneDivisores = false;

        System.out.print("Los divisores de " + n + " son: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                tieneDivisores = true;
            }
        }

        if (!tieneDivisores) {
            System.out.println("No tiene divisores aparte de 1 y " + n + ".");
        }
        System.out.println();

    }
}