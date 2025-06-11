import java.util.Scanner;
import java.io.*;

class Srustistudentt implements Serializable {
    int rollNo;
    String name;
    String course;

    public void setSrustistudentt(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public String toString() {
        return "Student Details:\n" +
               "Roll No is: " + rollNo + "\n" +
               "Name is: " + name + "\n" +
               "Course is: " + course;
    }
}

public class DynamicFileHandling {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Roll Number:");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Course:");
        String course = sc.nextLine();

        // Create object and set data
        Srustistudentt s1 = new Srustistudentt();
        s1.setSrustistudentt(roll, name, course);

        // Write object to file
        FileOutputStream fos = new FileOutputStream("Srusti.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        System.out.println("\nData Submitted Successfully.\n");
    }
}
