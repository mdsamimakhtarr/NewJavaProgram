//import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.DataOutputStream;
//public class fileHandling {
//    public static void main(String[] args)  throws IOException{
//        FileOutputStream fos=new FileOutputStream("Samim.txt");
//        DataOutputStream dos=new DataOutputStream(fos);
//        dos.writeInt(12000);
//        dos.writeUTF("Samim is a Good Boy");
//        dos.flush();
//        dos.close();
//    }
//}


// for  reading  Data From a file

import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;

public class fileHandling{
    public static void main(String[] args) throws IOException {
       FileInputStream fis=new FileInputStream("Samim.txt");
       DataInputStream dis=new DataInputStream(fis );
        System.out.println(  dis.readInt());
        System.out.println(dis.readUTF());

       dis.close();
    }
}