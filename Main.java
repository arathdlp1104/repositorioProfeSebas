import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int original = numero, inverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }

        if (original == inverso) {
            System.out.println(original + " es un número palíndromo.");
        } else {
            System.out.println(original + " no es un número palíndromo.");
        }


    }
}