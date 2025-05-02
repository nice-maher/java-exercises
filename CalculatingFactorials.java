import java.util.Scanner;
public class CalculatingFactorials {

    /*
    Write a method that calculates the factorial of a given number.
    The factorial of n is calculated by the product of integer number from 1 to n
    (inclusive). The factorial of 0 is equal to 1.
    */

    public static long factorial(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
