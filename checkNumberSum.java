import java.util.Scanner;

class checkEven{
   public String checkEvenNumber(int num){
    if(num% 2==0){
     return  num + " Even Number";
    }
    else{
       return num + " Odd Number";
    }
  }
}

public class checkNumberSum {
  public static void main(String[] args) {
    checkEven c1=new checkEven();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num1=sc.nextInt();
     System.out.println(c1.checkEvenNumber(num1));
  }
}
