import java.util.Scanner;

public class Ejercicio9{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa tu salario actual: " + "$");
        double salarioAnterior = sc.nextDouble();

        double nuevoSalario = salarioAnterior * 1.25;
        System.out.println("\n\n\t\t Tu nuevo salario es: " + "$" + nuevoSalario);
        sc.close();
    }
}
