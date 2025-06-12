class thread1 implements Runnable{
  public void run(){
    for(int i=1;i<=10;i++){
      System.out.println(i);
    }

  }
}
class thread2 implements Runnable{
  public void run(){
    for(int i=10;i<20;i++){
      System.out.println(i);
    }
  }
}

public class implementingInterface {
  public static void main(String[] args) {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
     Thread t3=new Thread(t1);
     Thread t4=new Thread(t2);

     t3.start();
     t4.start();
  }
}
