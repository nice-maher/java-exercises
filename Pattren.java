import java.util.Scanner;

public class Pattren {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello! how many stars do u want to print?");


if(sc.hasNextInt()){    
        int numOfStars = sc.nextInt();
        for(int i = 0;i < numOfStars; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = numOfStars; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}else{
    System.out.println("Please enter a number");
}






    }
    
}