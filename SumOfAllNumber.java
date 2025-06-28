import java.util.Scanner;

public class SumOfAllNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number for sum");
    int num1=sc.nextInt();
    int sum=0;
     for(int i=1;i<=num1;i++){
      sum=sum+i;
    
     }
     System.out.println("The Sumation is "+sum);
  }
}
