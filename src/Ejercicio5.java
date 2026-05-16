import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Introduce la nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Introduce la nota 3: ");
        double n3 = entrada.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("Tu promedio final es: " + promedio);

        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        entrada.close();
    }
}
