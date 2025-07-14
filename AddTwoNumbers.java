import java.util.Scanner;
class sum{
    public int SumTwoNumber(int x,int y){
      return x+y;
    }
}

public class AddTwoNumbers {
  public static void main(String[] args) {
    sum s1=new sum();
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the First Number");
  int num1=sc.nextInt();
  System.out.print("Enter the Second  Number");
  int num2=sc.nextInt();
   System.out.println(s1.SumTwoNumber(num1, num2));

   

  }
}
