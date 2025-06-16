import java.io.IOException;
import java .io.ObjectInputStream;
import java.io.FileInputStream;

public class readstudentdata {
  public static void main(String[] args)  throws IOException, ClassNotFoundException {
    FileInputStream fis =new FileInputStream("Srusti.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Srustistudentt s2= (Srustistudentt) ois.readObject();
    System.out.println(s2.toString());
    System.out.println("Data Read Successfully");

    ois.close();
    fis.close();

  }
  
}
