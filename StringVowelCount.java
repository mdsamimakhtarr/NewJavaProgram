import java.util.Scanner;
public class StringVowelCount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String name=sc.nextLine();
    int count=0;
     for(int i=0;i< name.length();i++){
      switch(name.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        count ++;
      }
     }
     System.out.println(" Vowel is "+count);
     sc.close();
  }
}
