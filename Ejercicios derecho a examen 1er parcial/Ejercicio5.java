import java.util.Scanner;

public class Ejercicio5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en °C: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " °C = " + fahrenheit + " °F");
        System.out.println(celsius + " °C = " + kelvin + " K");
        sc.close();
    }
}
