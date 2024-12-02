import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];


        for (int i = 0; i < 15; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0], menor = numeros[0], posMayor = 0, posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Mayor: " + mayor + " en posición " + posMayor);
        System.out.println("Menor: " + menor + " en posición " + posMenor);
        scanner.close();



    }
}