import java.util.Scanner;

public class UserInputReader {
    private final static   Scanner scanner = new  Scanner(System.in);

    public  static double readNumber(String prompt){//Overloading the read number method
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }
}
