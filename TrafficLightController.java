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
        }else if(currentState == 1){
            return "Red";
        }else if(currentState == 2){
            return "Yellow";
        }else {
            return "Invalid input";
        }
    }


    public static String getAction(String currentState){
        if(currentState.equals("Red")){
            return "Stop";
        }else if(currentState.equals("Yellow")){
            return "Caution";
        }else if(currentState.equals("Green")){
            return "Go";
        }else{
            return "Invalid input";
        }
    }
}
