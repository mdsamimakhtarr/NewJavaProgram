import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number if multipication table you want");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
        sc.close();
    }
}
