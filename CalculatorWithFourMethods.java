import java.util.Scanner;
import java.text.DecimalFormat;

class SimpleCalculator {

    public static void subtractTwoNumbers(double a, double b){
        System.out.println(a - b);
    }

    public static void sumTwoNumbers(double a, double b){
        System.out.println(a + b);
    }

    public static void divideTwoNumbers(double a, double b){
        if (b == 0){
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void multiplyTwoNumbers(double a, double b){
        System.out.println(a * b);
    }
}

public class CalculatorWithFourMethods {
    public static void main(String[] args){
        System.out.println("Please enter 2 numbers with Operator:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        String operator = sc.next();
        double num2 = sc.nextDouble();

        switch (operator){
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
