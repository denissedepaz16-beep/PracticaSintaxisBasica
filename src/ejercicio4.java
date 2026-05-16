import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la longitud del primer cateto (a): ");
        double catetoA = entrada.nextDouble();

        System.out.print("Introduce la longitud del segundo cateto (b): ");
        double catetoB = entrada.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        entrada.close();
    }
}