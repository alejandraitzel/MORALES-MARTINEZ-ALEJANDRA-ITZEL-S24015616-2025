import java.util.Scanner;

public class Ejercicio6{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa el número de hombres: ");
        int hombres = sc.nextInt();
        System.out.print("\n\n\t\t Ingresa el número de mujeres: ");
        int mujeres = sc.nextInt();

        int total = hombres + mujeres;
        double porcentajeHombres = (hombres * 100.0) / total;
        double porcentajeMujeres = (mujeres * 100.0) / total;

        System.out.println("\n\n\t\t Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("\n\n\t\t Porcentaje de mujeres: " + porcentajeMujeres + "%");
        sc.close();
    }
}
