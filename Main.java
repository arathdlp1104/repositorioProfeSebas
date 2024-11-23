import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int menor, medio, mayor;

        if (a < b && a < c) {
            menor = a;
            if (b < c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a < b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println("Números ordenados: " + menor + ", " + medio + ", " + mayor);
    }
}