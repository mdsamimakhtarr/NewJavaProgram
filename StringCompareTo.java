import java.util.Scanner;
public class StringCompareTo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The  First String");
    String f1 = sc.next();
    System.out.println("Enter The  Second  String");
    String f2 = sc.next();
    int res = f1.compareTo(f2);

    if (res > 0) {
      System.out.println("String One Is Greater Than String two: " + f1+"Is Greater ");
    } else if (res < 0) {
      System.out.println("String One Is Less Than String Two: " + f2+"Is Greater");
    } else {
      System.out.println("Both are Equal");
    }
    sc.close();
  }
}
// This Method is used to compare two String lexicographically ( It means the uncode value of the char)
// it compare the  unicode value