import java.util.Scanner;

public class DayOfTheWeekFromAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("please enter a number from 1 to 7:");
        int dayNumber = sc.nextInt();
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wedensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invaild number");
        }
        sc.close();
    }
}