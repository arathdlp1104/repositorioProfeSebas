import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 100):");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! El número era " + numeroSecreto);
            }
        } while (intento != numeroSecreto);

    }
}