import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;

// class Employee implements Serializable{
//   int id;
//   String Name;
//   String JobRole;

//   public void setStudent(int id,String Name,String JobRole){
//     this.id=id;
//     this.Name=Name;
//     this.JobRole=JobRole;
//   }
//   public void getDetails(){
//     System.out.println("Employee id is "+id);
//     System.out.println("Employee Name is "+Name);
//     System.out.println("Employee JobRole is "+JobRole);
//   }
//   public String toString(){
//     return "Employee  is :\n"+id+
//     " Employee Name :"+Name+
//     "Employee job role :"+JobRole;
//   }
// }
// public class dynamicFile {
//   public static void main(String[] args) throws IOException {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the Employee Number");
//     int id=sc.nextInt();
//     sc.nextLine();
//     System.out.println("Enter the Employee Name");
//     String name=sc.nextLine();
//     System.out.println("Enter the job Role");
//     String job=sc.nextLine();

//     Employee e1=new Employee();
//     e1.setStudent(id, name, job);
//     FileOutputStream fos=new FileOutputStream("Gulu.txt");
//     ObjectOutputStream oos=new ObjectOutputStream(fos);
//     oos.writeObject(e1);
//     oos.flush();
//     oos.close();
//     sc.close();
//     System.out.println("Data Submitted Successfully");

//   }
// }

public class dynamicFile{
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileInputStream fis=new FileInputStream("Gulu.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Employee s=(Employee)ois.readObject();
    System.out.println(s);


  }

}
