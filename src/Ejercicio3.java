import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el monto total de la Compra: ");
        double montoCompra = entrada.nextDouble();

        double descuento = montoCompra * 0.10;
        double totalPagar = montoCompra - descuento;

        System.out.println("El descuento aplicado es de: $" + descuento);
        System.out.println("El total neto a pagar es: $" + totalPagar);

        entrada.close();
    }
}