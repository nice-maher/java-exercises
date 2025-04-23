import java.util.Scanner;

public class IsBetween {
        public static void main(String[] args) {


            /* Write a program that reads three integer numbers
            and prints true if the first number is between the second and
            the third one (inclusive).Otherwise, it must print false. */

            Scanner scanner = new Scanner(System.in);

            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int thirdNumber = scanner.nextInt();

            boolean isBetween = (firstNumber >= secondNumber && firstNumber <= thirdNumber ) ||
                                (firstNumber <= secondNumber && firstNumber >= thirdNumber );


            System.out.println(isBetween);

        }
    }
