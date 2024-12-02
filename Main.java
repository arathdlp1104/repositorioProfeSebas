import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        boolean[] contado = new boolean[10];
        for (int i = 0; i < numeros.length; i++) {
            if (!contado[i]) {
                int frecuencia = 1;
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        frecuencia++;
                        contado[j] = true;
                    }
                }
                System.out.println("Número " + numeros[i] + " aparece " + frecuencia + " veces");
            }
        }


    }
}