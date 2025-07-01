import java.util.Scanner;
public class simpleinterestt {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Principal Amount");
    int amount=sc.nextInt();
    System.out.println("Enter the time duration");
    int time=sc.nextInt();
    System.out.println("Enter the  rate of interest");
    int rate=sc.nextInt();

    int SI=amount*time*rate;
    System.out.println("The Simple Interest is :"+SI);
    sc.close();
  }
}
