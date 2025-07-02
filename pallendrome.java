import java.util.Scanner;
public class pallendrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num1=sc.nextInt();
    int original=num1;
    int reverse=0;

    while(num1 > 0 ){
      reverse=reverse*10+num1%10;
      num1/=10;
    }
    if(original==reverse){
      System.out.println("Pallendrome");
    }
    else {
      System.out.println("Not a pallendrome ");
    }
    sc.close();
  }
}