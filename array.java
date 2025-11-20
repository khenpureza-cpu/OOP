// Activity 3: use of array
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Array elements: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
    }
}
