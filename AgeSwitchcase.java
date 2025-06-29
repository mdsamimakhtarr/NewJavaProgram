import java.util.Scanner;
public class AgeSwitchcase {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int age=sc.nextInt();
    switch(age){
      case 18:
      System.out.println("Adult");
      break;
      case 17:
      System.out.println("Not Adult");
      break;

      case 16:
      System.out.println("Not Adult");
      break;
      default :{
      System.out.println("Invalid age ");
    }
    }
    

  }
}
