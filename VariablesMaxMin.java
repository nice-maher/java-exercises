import java.util.Scanner;

public class VariablesMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter data type to check min and max value (e.g., Integer, Byte, Short, Long, Float, Double):");
        String stringInput = sc.next();
        
        if (stringInput.equalsIgnoreCase("Integer") || stringInput.equalsIgnoreCase("int")) {
            System.out.printf("The max value is: %d\nThe min value is: %d\n", Integer.MAX_VALUE, Integer.MIN_VALUE);
        } else if (stringInput.equalsIgnoreCase("Byte")) {
            System.out.printf("The max value is: %d\nThe min value is: %d\n", Byte.MAX_VALUE, Byte.MIN_VALUE);
        } else if (stringInput.equalsIgnoreCase("Short")) {
            System.out.printf("The max value is: %d\nThe min value is: %d\n", Short.MAX_VALUE, Short.MIN_VALUE);
        } else if (stringInput.equalsIgnoreCase("Long")) {
            System.out.printf("The max value is: %d\nThe min value is: %d\n", Long.MAX_VALUE, Long.MIN_VALUE);
        } else if (stringInput.equalsIgnoreCase("Float")) {
            System.out.printf("The max value is: %.2f\nThe min value is: %.2f\n", Float.MAX_VALUE, Float.MIN_VALUE);
        } else if (stringInput.equalsIgnoreCase("Double")) {
            System.out.printf("The max value is: %.2f\nThe min value is: %.2f\n", Double.MAX_VALUE, Double.MIN_VALUE);
        } else {
            System.out.println("Please make sure to write one of the following: Integer, Byte, Short, Long, Float, Double (case insensitive)");
        }
        sc.close();
    }
}
