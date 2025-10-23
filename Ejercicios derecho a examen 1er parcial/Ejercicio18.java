import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t\t Ingresa la duración de la llamada en minutos: ");
        int minutos = sc.nextInt();

        double total;

        if (minutos <= 3) {
            total = 10.0; 
        } else {
            total = 10.0 + (minutos - 3) * 1.0;
        }

        System.out.println("\n\t\t El total a pagar por la llamada es: N$" + total);

        sc.close();
    }
}
