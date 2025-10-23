import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t Ingresa un número: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " no es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) System.out.println(n + " es primo");
            else System.out.println(n + " no es primo");
        }

        sc.close();
    }
}
