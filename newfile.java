import java.util.Scanner;

public class MotivationalMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your progress (percentage): ");
        int progress = scanner.nextInt();
        scanner.close(); //Good practice to close the scanner

        if (progress >= 90) {
            System.out.println("Thursday: Almost there!");
            System.out.println("Good job!");
        } else if (progress >= 75) {
            System.out.println("Making good progress!");
        } else {
            System.out.println("Keep trying!");
        }
    }
}

