class Addition {
  private int x;
  private int y;
  synchronized void Add(int x,int y){
    this.x=x;
    this.y=y;

    try{
      Thread.sleep(5000);

    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
    int res=this.x+this.y;
   // System.out.println(Thread.currentThread().getName()+res);
   System.out.println("The addition is "+res);
   }
}

class thread1 extends Thread{
  private Addition a;
  public thread1(Addition a ){
    this.a=a;
  }
  @Override
 public  void run(){
  a.Add(10, 20);
  }
}

class thread2 extends Thread{
  private Addition a ;
  public  thread2 (Addition a ){
    this.a=a;
  }
  @Override
  public void run(){
    a.Add(40, 50);
  }
}

public class syncronizationAddition {
  public static void main(String[] args) {
    Addition a1=new Addition();
    thread1 t1=new thread1(a1);
    thread2 t2=new thread2(a1);

    t1.start();
    t2.start();
    
  }
}
