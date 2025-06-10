import java.util.Scanner;

public class primeNumberr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 2;
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        while (start < num) {
            if (num % start == 0) {
                break;
            }
            start++;
        }
        if (start == num) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not a prime number");
        }
        sc.close();
    }
}
