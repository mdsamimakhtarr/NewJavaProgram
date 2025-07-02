import java.util.Scanner;
public class Armstrong {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    int d,sum=0,t;
    t=num;
    while(num > 0){
      d=num%10;
      sum+=d*d*d;
      num/=10;
    }
    if(sum==t){
      System.out.println("Armstrong Number");
    }
    else{
      System.out.println("Not a Armstrong Number");
    }
  }
}