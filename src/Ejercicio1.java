import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la base del Rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Introduce la altura del Rectángulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;

        System.out.println("El área del Rectángulo es: " + area);

        entrada.close();
    }
}