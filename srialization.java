// import java.io.Serializable;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;
// import java.util.Scanner;
// class Student implements Serializable{
//   int rollNo;
//   String Name;
//   String course;
//   public void setStudent(int rollNo,String Name,String course){
//     this.rollNo=rollNo;
//     this.Name=Name;
//     this.course=course;
//   }
//   void getStudent(){
//     System.out.println("Roll is "+rollNo);
//     System.out.println("Name is "+Name);
//     System.out.println("course is "+course);
//   }
//   public String toString(){
//     return " Student Details :\n"+
//     "Roll is "+rollNo+
//     "Name is "+Name+
//     "course is :"+course;
//   }
// }

// public class Srialization {
//   public static void main(String[] args)  throws IOException{
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name ");
//     String name=sc.next();
//     System.out.println("Enter the course ");
//     String course=sc.next();
//     System.out.println("Enter the Roll No");
//     int roll=sc.nextInt();

//     Student s1=new Student();
//     s1.setStudent(roll, name, course);  

//     FileOutputStream fos=new FileOutputStream("Rahul.txt");
//     ObjectOutputStream oos=new ObjectOutputStream(fos);
//     oos.writeObject(s1);
//     oos.flush();
//     oos.close();
//     System.out.println(" Data Submitted SuccessfullY");
    
//   }
// }



// For Reading Data From the Txt file ;

import java .util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class  Srialization{
  public static void main(String[] args) throws IOException,ClassNotFoundException{
    FileInputStream fis =new FileInputStream("Rahul.txt");
    ObjectInputStream ois =new ObjectInputStream(fis);

    Student s=(Student)ois.readObject();
    System.out.println(s);
   
    
  }
}