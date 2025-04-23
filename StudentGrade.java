

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name ");
        String name = sc.nextLine();
        
        System.out.println("Please enter your grade ");
        int grade = sc.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Please " + " " + name + ", " + "enter a valid number");
        } else if (grade >= 91) {
            System.out.println("Perfect" + " " + name + "!, " + "you are accepted!");
        } else if (grade >= 81) {
            System.out.println("Very good" + " " + name + "!, " + " you are accepted!");
        } else if (grade >= 71) {
            System.out.println("Good" + " " + name + "!, " + "you are accepted!");
        } else if (grade >= 60) {
            System.out.println("you are accepted" + " " + name +"! ");
        } else {
            System.out.println("Sorry" + " " + name + ", " + "you are not accepted");
        }

        sc.close();
    }
}