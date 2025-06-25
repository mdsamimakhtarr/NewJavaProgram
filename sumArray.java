import java.util.Scanner;
public class sumArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size ");
    int size=sc.nextInt();
    int [] Add =new int[size];
    int  sum =0;
    System.out.println("Enter the Element");
    for(int i=0; i < Add.length;i++){
      System.out.println("Input "+(i+1)+" th element");
      Add[i]=sc.nextInt();
    }
    for(int  s1:Add){
      sum = sum+s1;
      System.out.println(sum);
    }
   
sc.close();

  }
}
