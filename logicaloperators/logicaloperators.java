// Activity 2: logical operators
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first boolean (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter second boolean (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.println("a AND b: " + (a && b));
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + (!a));
        System.out.println("NOT b: " + (!b));
        
        scanner.close();
    }
}
