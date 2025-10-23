import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t Ingresa la nota (0.0 - 5.0): ");
        double nota = sc.nextDouble();
        String valoracion = "";

        if (nota >= 0 && nota <= 1) valoracion = "P (Pésimo)";
        else if (nota > 1 && nota <= 2) valoracion = "M (Mal)";
        else if (nota > 2 && nota <= 2.9) valoracion = "R (Regular)";
        else if (nota >= 3 && nota <= 4) valoracion = "B (Bien)";
        else if (nota > 4 && nota <= 5) valoracion = "E (Excelente)";
        else valoracion = "Nota inválida";

        System.out.println("\n\t\t Valoración: " + valoracion);
        sc.close();
    }
}
