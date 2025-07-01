import java.util.Arrays;
import java.util.Scanner;
public class compareTo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first String");
    String s1=sc.nextLine();
    System.out.println("Enter the Second String");
    String s2=sc.nextLine();
    if(s1.compareTo(s2)> 0){
      System.out.println(" first String is Greatest");
    }
    else if(s1.compareTo(s2)< 0){
      System.out.println(" Second String is greatest");
    }
    else{
      System.out.println("Both are Equal");
    }
    sc.close();
    
  }
}
