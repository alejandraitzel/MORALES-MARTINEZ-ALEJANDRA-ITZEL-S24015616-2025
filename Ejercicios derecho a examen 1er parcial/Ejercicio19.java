import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t\t Ingresa el presupuesto anual del hospital: ");
        double presupuesto = sc.nextDouble();

        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;

        System.out.println("\n\t\t Ginecología recibirá: N$" + ginecologia);
        System.out.println("\n\t\t Traumatología recibirá: N$" + traumatologia);
        System.out.println("\n\t\t Pediatría recibirá: N$" + pediatria);

        sc.close();
    }
}
