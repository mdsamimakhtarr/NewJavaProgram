class sleepMeth implements Runnable{
  public void run(){
    String name=Thread.currentThread().getName();
    try{
      for(int i=0;i<=3;i++){
        System.out.println(name);
        Thread.sleep(1000);
      }

    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}



public class sleepmethod {
  public static void main(String[] args) {
    sleepMeth s1=new sleepMeth();
    Thread t1=new Thread(s1);
    t1.setName("Samim");
    t1.start();
  }
}
