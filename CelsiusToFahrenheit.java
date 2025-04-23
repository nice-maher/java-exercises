import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        sc.close();
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
