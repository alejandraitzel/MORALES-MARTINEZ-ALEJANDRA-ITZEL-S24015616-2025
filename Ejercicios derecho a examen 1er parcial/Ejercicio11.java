import java.util.Scanner;

public class Ejercicio11{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa el primer valor: ");
        double a = sc.nextDouble();
        System.out.print("\n\n\t\t Ingresa el segundo valor: ");
        double b = sc.nextDouble();
        System.out.print("\n\n\t\t Ingresa el tercer valor: ");
        double c = sc.nextDouble();

        if (a == b && b == c){
            System.out.println("\n\n\t\t Los tres valores son iguales: " + a);
        } else {
            double mayor = a;
            double menor = a;

            if (b > mayor) mayor = b;
            if (c > mayor) mayor = c;

            if (b < menor) menor = b;
            if (c < menor) menor = c;

            double promedio = (a + b + c) / 3;

            System.out.println("\n\n\t\t Mayor: " + mayor);
            System.out.println("\n\n\t\t Menor: " + menor);
            System.out.println("\n\n\t\t Promedio: " + promedio);
        }

        sc.close();
    }
}
