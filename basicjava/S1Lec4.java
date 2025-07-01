import java.util.Scanner;
public class S1Lec4 {
  
    public static long countDigits(long n) {
        int count = 0;
        
        if (n == 0) {
            return 1; // Special case: 0 has 1 digit
        }

        while (n != 0) {
            count++;
            n = n / 10;  // remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        // int n = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextLong();
        System.out.println(countDigits(n));  // Output: 3
    }

}
