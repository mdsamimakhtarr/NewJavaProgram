import java.util.Scanner;
public class ArrayEvenOddCount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    int[] number=new int[size];
    System.out.println("Enter the numbers");
    for(int i=0;i<number.length;i++){
      System.out.println("Input"+(i+1)+" th elements");
      number[i]=sc.nextInt();
    }
    int even_count=0;
    int Odd_count=0;
    for(int i=0;i< size;i++){
      if(number[i]%2==0){
        even_count++;
      }
      else if(number[i]%2!=0){
        Odd_count++;
      }
      System.out.println("The Even Number is "+even_count);
      System.out.println("The Odd count is "+Odd_count);
    }
  }
}
