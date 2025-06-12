class thread1 extends Thread{
  public void run(){
    for(int i=1;i<3;i++){
      System.out.println(i);
    }
  }
}
class thread2 extends Thread{
  public void run(){
    for(int i=10;i<=20;i++){
      System.out.println(i);
    }
  }
}
public class ExtendingThreadclass {
  public static void main(String[] args) {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
    t1.start();
    t2.start();
  }
}
