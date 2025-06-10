
import java.util.Scanner;
class AgeLimitException extends RuntimeException {
    AgeLimitException(String msg) {
        super(msg);
    }
}
public class userDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Valid Age: ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new AgeLimitException("Age must be greater than or equal to 18");
        } else if (age >= 18 && age <= 120) {
            System.out.println("Collect your Voter card from eSeva after 30 days.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}
