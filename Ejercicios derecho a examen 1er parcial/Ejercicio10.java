import java.util.Scanner;

public class Ejercicio10{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t Ingresa la calificación de la primera materia: ");
        double materia1 = sc.nextDouble();
        System.out.print("\n\n\t\t Ingresa la calificación de la segunda materia: ");
        double materia2 = sc.nextDouble();
        System.out.print("\n\n\t\t Ingresa la calificación de la tercera materia: ");
        double materia3 = sc.nextDouble();

        double promedio = (materia1 + materia2 + materia3) / 3;
        System.out.println("\n\n\t\t Tu promedio general es: " + promedio);
        sc.close();
    }
}
