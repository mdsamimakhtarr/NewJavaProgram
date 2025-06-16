class thread1 implements Runnable{
  public void run(){
    String name=Thread.currentThread().getName();
    for(int i=0;i<=3;i++){
      System.out.println(name);
    }
  }
}
class thread2 implements Runnable{
  public void run(){
    String name=Thread.currentThread().getName();
    for(int i=0;i<=3;i++){
      System.out.println(name);
    }
  }
}


public class implementRunnableInterface {
  public static void main(String[] args) throws InterruptedException {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
     Thread t3=new Thread(t1);
     Thread t4=new Thread(t2);
     t3.setName("Samim");
     t4.setName("Rahul");
   

    
     t4.start();
     t4.join();

      t3.start();
     t3.join();
  }
}
