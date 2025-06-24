class Task extends Thread{
  private StringBuilder sb;
  // Constructor to initialize StringBuilder
  // This constructor is used to pass the StringBuilder instance to the thread
  public Task(StringBuilder sb) {
      this.sb = sb;
  }

  public void run() {
      for (int i = 0; i < 100; i++) {
          sb.append("Hello");
      }
  }
}

public class StringBuilderExample {
  public static void main(String[] args)  throws InterruptedException {
      StringBuilder sb = new StringBuilder();
      Task t1 = new Task(sb);
      Task t2 = new Task(sb);
      t1.start();
      t2.start();
      t1.join();
      t2.join();
      System.out.println("Final Length of StringBuilder: " + sb.length());
  }
}
