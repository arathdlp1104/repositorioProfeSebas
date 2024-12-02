import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase: ");
        String entrada = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        boolean esPalindromo = true;
        for (int i = 0, j = entrada.length() - 1; i < j; i++, j--) {
            if (entrada.charAt(i) != entrada.charAt(j)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        scanner.close();

    }
}