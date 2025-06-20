import java.util.Scanner;
public class StringCount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String  name=sc.nextLine();
    int count=0;
     for(int i= 0;i<  name.length();i++){
      if( name.charAt(i)!=' '){
        count ++;
      }
     }
     System.out.println("count is "+count);
  }
  
}
