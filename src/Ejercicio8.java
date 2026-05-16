import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = entrada.nextDouble();

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor de los tres ingresados es: " + mayor);

        entrada.close();
    }
}
