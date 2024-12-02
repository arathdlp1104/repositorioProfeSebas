import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[10];
        double suma = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        int arribaPromedio = 0, debajoPromedio = 0;

        for (double cal : calificaciones) {
            if (cal > promedio) arribaPromedio++;
            else if (cal < promedio) debajoPromedio++;
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificaciones arriba del promedio: " + arribaPromedio);
        System.out.println("Calificaciones debajo del promedio: " + debajoPromedio);
        scanner.close();


    }
}