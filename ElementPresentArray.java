import java.util.Scanner;
public class ElementPresentArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = {12, 13, 14, 15};

    System.out.println("Enter the element to be searched:");
    int search = sc.nextInt();
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == search) {
        System.out.println("Element found at index " + i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Element not found");
    }
    sc.close();
  }
}
