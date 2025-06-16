// import java.io.IOException;
// import java.util.Scanner;
// import java.io.DataOutputStream;
// import java.io.FileOutputStream;;

// public class fileHandingProgramStudent {
//   public static void main(String[] args) throws IOException {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter Your Roll Number");
//     int roll=sc.nextInt();
//     System.out.println("Enter Your Name ");
//     String name=sc.next();
//     System.out.println("Enter Your course");
//     String course=sc.next();
//     System.out.println("Enter your Email Id");
//     String email=sc.nextLine();
//     sc.nextLine();
//     System.out.println("Enter Your Phone Number");
//     long phone=sc.nextLong();

//     System.out.println("Enter your fees ");
//     double fees=sc.nextDouble();

//     System.out.println("Studenting ");
//     boolean study=sc.nextBoolean();

//      FileOutputStream fos =new  FileOutputStream("Student.txt");
//      DataOutputStream dos=new DataOutputStream(fos);

     

//      dos.writeInt(roll);
//      dos.writeUTF(name);
//      dos.writeUTF(email);
//      dos.writeLong(phone);
//      dos.writeDouble(fees);
//      dos.writeBoolean(study);
//      dos.writeUTF(course);
//      System.out.println("Data Submitted Successfully");

//      dos.flush();
//      dos.close();
//      sc.close();

//   }
// }


// for Read Data 


import java.io.FileInputStream;
import java.io.IOException;
import java .io.DataInputStream;

public class  fileHandingProgramStudent{
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("Student.txt");
    DataInputStream dos =new DataInputStream(fis);

    System.out.println(dos.readInt());
    System.out.println(dos.readUTF());
    System.out.println(dos.readUTF());
    System.out.println(dos.readLong());
    System.out.println(dos.readDouble());
    System.out.println(dos.readBoolean());

    dos.close();
   
  }
}