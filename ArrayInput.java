import java .util.Scanner;
public class ArrayInput {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double[] fee=new double[5];

    System.out.println("Enter the Array Element");
    for(int i=0;i<fee.length;i++){
      System.out.println("Input "+(i+1)+" th Element");
      fee[i]=sc.nextDouble();
    }
    for( double x:fee){
      System.out.println(x);
    }
    sc.close();
  }
}
