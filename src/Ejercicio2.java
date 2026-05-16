import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el radio de la Circunferencia: ");
        double radio = entrada.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la Circunferencia es: " + area);

        entrada.close();
    }
}
