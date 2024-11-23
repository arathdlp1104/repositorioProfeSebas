import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número para generar su tabla: ");
        int numero = sc.nextInt();
        System.out.print("Ingrese el rango hasta el cual multiplicar: ");
        int rango = sc.nextInt();

        for (int i = 1; i <= rango; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


    }
}