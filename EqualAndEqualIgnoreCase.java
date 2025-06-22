import java.util.Scanner;
public class EqualAndEqualIgnoreCase {
  public static void main(String[] args) {
    Scanner sc=new Scanner  (System.in);
    System.out.println("Enter the UserName");
    String uname=sc.nextLine();
    System.out.println("Enter the Password");
    String pwd=sc.nextLine();

    if(uname.equalsIgnoreCase("Samim")&& pwd.equals("Samim@123")){
       System.out.println("Welcome To HomePage ");
    }
    else{
       System.out.println("Invalid PassWord ");
    }

  }
}
// equals method compare two String Where case is important
// It also compare Only the contain Not Memory Location


// equalIgnoreCase compare Two String Where case is not Important

// Both are return Boolean value 