import java.util.Scanner;

public class OddSumScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int totalSum = 0;
        
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            totalSum += i;
        }
        
        System.out.println("\nThe sum of odd numbers from 1 to " + n + " is: " + totalSum);
        
        scanner.close();
    }
}
