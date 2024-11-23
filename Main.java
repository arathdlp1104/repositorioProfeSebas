import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número hasta el cual calcular la serie de Fibonacci: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Serie de Fibonacci: " + a);
        if (n > 0) {
            System.out.print(", " + b);
        }

        while (b <= n) {
            c = a + b;
            if (c > n) break;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();


    }
}