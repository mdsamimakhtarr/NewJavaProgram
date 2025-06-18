class multiplication {
  private int x;
  private int y;

  synchronized void mul(int x, int y) {
    this.x = x;
    this.y = y;
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    int res = this.x * this.y;
    System.out.println("The multiplication is " + res);
  }
}

class thread1 extends Thread {
  private multiplication m;
  public thread1(multiplication m) {
    this.m = m;
  }
  @Override
  public void run() {
    m.mul(40, 100);
  }
}

class thread2 extends Thread {
  private multiplication m;
  public thread2(multiplication m) {
    this.m = m;
  }
  @Override
  public void run() {
    m.mul(20, 100);
  }
}

public class multiplicationSyncronized {
  public static void main(String[] args) {
    multiplication m1 = new multiplication();
    thread1 t1 = new thread1(m1);
    thread2 t2 = new thread2(m1);
    t1.start();
    t2.start();
  }
}