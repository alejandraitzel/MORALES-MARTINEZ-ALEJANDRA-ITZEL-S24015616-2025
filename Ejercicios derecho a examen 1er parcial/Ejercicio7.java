import java.util.Scanner;

public class Ejercicio7{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa el total de la compra: " + "$");
        double totalCompra = sc.nextDouble();

        double precioFinal = totalCompra * 0.85; // descuento 15%
        System.out.println("\n\n\t\t El precio final a pagar es: " + "$" + precioFinal);
        sc.close();
    }
}
