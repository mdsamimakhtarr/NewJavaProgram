import java.util.Scanner;
public class maxArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int size = sc.nextInt();
    int[] max = new int[size];
    System.out.println("Enter the Element");
    for (int i = 0; i < max.length; i++) {
      System.out.println("Input " + (i + 1) + " th element");
      max[i] = sc.nextInt();
    }

    int max_Element = max[0];
    int min_Element = max[0];
    for (int i = 1; i < size; i++) {
      if (max[i] > max_Element) {
        max_Element = max[i];
      } else if (max[i] < min_Element) {
        min_Element = max[i];
      }
    }
    System.out.println("The maximum element is " + max_Element);
    System.out.println("The minimum element is " + min_Element);
    sc.close();
  }
}

