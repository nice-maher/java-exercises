import java.util.Scanner;
public class CheckingDivisibilityAndPrintingAppropriateStrings {
    public static void main(String[] args ){

        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    if (num % 3 == 0 && num % 5 == 0){
        isDivByThreeAndFive(num);
    }else if(num % 3 == 0){
        isDivByThree(num);
    }else if(num % 5 == 0){
        isDivByFive(num);
    }else{
        System.out.println("None");
    }
    }
    public static void isDivByThree(int num){
     if (num % 3 == 0){
         System.out.println("Fizz");
     }
    }
    public static void isDivByFive(int num){
        if (num % 5 == 0){
            System.out.println("Buzz");
        }
    }
    public static void isDivByThreeAndFive(int num){
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
    }
}
