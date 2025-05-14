import java.util.Scanner;

public class TrafficLightController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the current traffic light state (0 for Red, 1 for Yellow, 2 for Green): ");
        int currentState = scanner.nextInt(); // Read user input

        String nextState = getNextState(currentState);
        String action = getAction(nextState);


        System.out.println("Next state: " + nextState);
        System.out.println("Action: " + action);

        scanner.close();
    }


    public static String getNextState(int currentState){

        if(currentState == 0){
            return "Green";
        }

        if(currentState == 1){
            return "Red";
        }

        if(currentState == 2){
            return "Yellow";
        }


        return "Invalid input";
    }


    public static String getAction(String currentState){
        return switch (currentState) {
            case "Red" -> "Stop"; // stop here and return Stop

            case "Yellow" -> "Caution";
            case "Green" -> "Go";
            default -> "Invalid input";
        };


    }
}
