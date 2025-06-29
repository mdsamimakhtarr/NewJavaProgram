import java.util.Scanner;
public class reverseNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int reverse=0;
    int rem;
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    while(num!=0){
      rem=num%10;
      reverse=reverse*10+rem;
      num/=10;
    }
    System.out.println("The reverse Number is "+reverse);
    sc.close();
  }
}
