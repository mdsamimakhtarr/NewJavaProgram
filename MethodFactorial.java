import java.util.Scanner;

class FactroialNumber{
  public int Factorial(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
      fact=fact*i;

    }
    return fact;
  }
}
public class MethodFactorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    FactroialNumber f1=new FactroialNumber();
    System.out.println("Enter the Number");
    int num1=sc.nextInt();
    System.out.println(f1.Factorial(num1));
  }
}
