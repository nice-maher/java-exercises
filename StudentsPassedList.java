import java.util.Scanner;

public class StudentsPassedList {
    public static void main(String[] args) {
        String names[] = {"Maher", "Mossab", "Malek", "Gautier", "Hidde", "Ahmad", "Alex"};
        int grades[] = {89, 99, 78, 47, 67, 56, 90};
        Scanner sc = new Scanner(System.in);

        print("Please enter your name:");
        String name = sc.next();
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                System.out.println(name + " your grade is " + grades[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            print("your name is not in the list");

        }
        sc.close();
    }

    public static void print(String s){
        System.out.println(s);
    }
}
