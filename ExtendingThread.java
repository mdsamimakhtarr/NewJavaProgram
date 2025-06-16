class  thread1 extends Thread{
  public void run(){
    String name=Thread.currentThread().getName();
    for(int i=0;i<=3;i++){
      System.out.println(name);
    }
  }
}
class thread2 extends Thread{
  public void run(){
    String name=Thread.currentThread().getName();
    for(int i=0;i<=3;i++){
      System.out.println(name);
    }
  }
}
 public class ExtendingThread {
  public static void main(String[] args) throws InterruptedException {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
    t1.setName("Samim");
    t2.setName("Rahul");

    t1.start();
    t1.join();
    t2.start();

  }
}
