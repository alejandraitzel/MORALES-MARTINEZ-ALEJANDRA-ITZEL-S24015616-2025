import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t\t Ingresa el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("\n\t\t Ingresa el número escogido al azar (0-99): ");
        int numero = sc.nextInt();

        double descuento;

        if (numero < 74) {
            descuento = totalCompra * 0.15;
        } else {
            descuento = totalCompra * 0.20;
        }

        double totalPagar = totalCompra - descuento;

        System.out.println("\n\t\t Descuento aplicado: N$" + descuento);
        System.out.println("\n\t\t Total a pagar: N$" + totalPagar);

        sc.close();
    }
}
