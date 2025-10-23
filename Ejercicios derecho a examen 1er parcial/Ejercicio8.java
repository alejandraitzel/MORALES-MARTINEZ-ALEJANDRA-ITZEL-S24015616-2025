import java.util.Scanner;

public class Ejercicio8{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa el capital a invertir: ");
        double capital = sc.nextDouble();

        double ganancia = capital * 0.02; 
        System.out.println("\n\n\t\t Ganancia después de un mes: " + "$" + ganancia);
        sc.close();
    }
}
