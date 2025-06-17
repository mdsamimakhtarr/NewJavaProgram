import java.util.Scanner;
public class primeExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter  a number to check the Number is prime or Not ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println("The number is prime");
        }else {
            System.out.println("The number is not a prime ");
        }

    }
}
