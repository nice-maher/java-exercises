import java.util.Random;

public class RandomLine {
    public static void main(String[] args) {
        String[] randomLine = {"Hello World",
                           "Java is fun",
                           "I'm Maher from Syria",
                           "You have a beautiful eyes",
                           "Just do it!",
                           "Keep trying",
                           "You smell bad",
                           "I like Programming",
                           "I like Hind<3",
                           "I love my family",
        };
        Random random = new Random();
        int randomLength = random.nextInt(randomLine.length);
        System.out.println(randomLine[randomLength]);
    }
}
