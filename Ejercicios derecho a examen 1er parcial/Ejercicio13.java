import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t Ingresa coeficiente A: ");
        double a = sc.nextDouble();
        System.out.print("\n\t\t Ingresa coeficiente B: ");
        double b = sc.nextDouble();
        System.out.print("\n\t\t Ingresa coeficiente C: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("\n\t\t ========== No es una ecuación cuadrática ==========");
        } else {
            double discriminante = b*b - 4*a*c;
            if (discriminante < 0) {
                System.out.println("\n\t\t ========== Raíces imaginarias. No hay soluciones reales ==========");
            } else {
                double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
                System.out.println("\n\t\t Raíz 1: " + x1);
                System.out.println("\n\t\t Raíz 2: " + x2);
            }
        }
	
        sc.close();
    }
}
