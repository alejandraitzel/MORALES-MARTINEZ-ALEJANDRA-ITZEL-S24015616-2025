import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        System.out.println("\n\n\t\t Longitud de la circunferencia: " + (2 * Math.PI * radio));
        System.out.println("\n\n\t\t Área del círculo: " + (Math.PI * radio * radio));
        }
}
