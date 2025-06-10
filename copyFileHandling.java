//import java.io.IOException;
//import java.io.*;
//public class copyFileHandling {
//    public static void main(String[] args) throws IOException {
//        FileInputStream fis=new FileInputStream("Samim.txt");
//        FileOutputStream fos=new FileOutputStream("Wasim.txt");
//        int data;
//        while ((data=fis.read())!=-1){
//            fos.write(data);
//            fos.flush();
//        }
//        System.out.println("Data is copied ");
// 

import java.io.*;

public class copyFileHandling{
    public static void main(String[] args)  throws IOException{
        FileInputStream fis =new FileInputStream("Wasim.txt");
        DataInputStream dis=new DataInputStream(fis );
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
    }
}