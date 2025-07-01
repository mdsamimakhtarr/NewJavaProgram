import java.util.Scanner;
public class checkArray{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean isArray=false;
    float marks[]={12,13,15,16};
    System.out.println("Enter the number to be searched");
    int num=sc.nextInt();
    for(float element:marks){
      if(num==element){
        isArray=true;
        break;
      }
    }
    if(isArray){
      System.out.println("Number is Present is Array at Index ");
    }
    else{
      System.out.println("Number is Not Present");
    }
  }
}