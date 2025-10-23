import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("\n\t\t ========== Salario por categoría ==========");
	double salarioxh = 0;	
	System.out.print("\n\t\t Introduzca la categoria del trabajador (1-4): ");
	int cat = sc.nextInt();
	System.out.print("\n\t\t Introduzca el numero de horas trabajadas en el mes: ");
	double h = sc.nextDouble();

		switch(cat){
		case 1: 
		salarioxh = 20000;
		break;
		case 2: 
		salarioxh = 15000;
		break;
		case 3: 
		salarioxh = 10000;
		break;
		case 4: 
		salarioxh = 7500;
		break;
		default:

		System.out.println("\n\t\t Opción invalida");
		}

		double salariom = salarioxh * h;
		double salud = salariom * 0.072;
		double subsidio = 0;
		if(salariom < 1000000){
		subsidio = salariom * 0.15;
		}

		double salariot = salariom - salud + subsidio;
	
		System.out.printf("\n\t\t ==================================================== \n");	

		System.out.printf("\n\t\t Salario Mensual: $ %,.2f \n", salariom);
		System.out.printf("\n\t\t Descuento del 7.2%% por concepto de salud: $ %,.2f \n", salud);
		System.out.printf("\n\t\t Subsidio sumado: $ %,.2f \n", subsidio);
		System.out.printf("\n\t\t Salario a pagar: $ %,.2f \n", salariot);
	
		sc.close();
	
		}
	}