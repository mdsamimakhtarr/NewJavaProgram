
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        String reverse = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
       String original= sc.nextLine();
       int  length=original.length();
       for(int i=length-1;i>=0;i--){
           reverse=reverse+original.charAt(i);
       }
        System.out.println("reverse of the String is "+reverse);
    }
}
