class BankAccount{
  private int balance=1000;

  public synchronized void withdraw(int amount,String userName ){
    if(balance >=amount){
      System.out.println("Withdraw Amount "+userName+" ");
    }
    try{
      Thread.sleep(2000);
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
    balance -=amount;
    System.out.println(userName+" withdraw amount Successfully "+" Remaining Balance is  "+balance);
   
  } 
}
class WithdrawalThread extends Thread {
    private BankAccount account;
    private int amount;
    private String userName ;

    public WithdrawalThread(BankAccount account,int amount, String userName ){
      this.account=account;
      this.amount=amount;
      this.userName=userName ;
    }
    public void run(){
      account.withdraw(amount, userName);
    }

}

public class BankSyncronized {
  public static void main(String[] args) {
    BankAccount b1=new BankAccount();
    WithdrawalThread t1=new WithdrawalThread(b1, 500, " Samim");
    WithdrawalThread t2=new WithdrawalThread(b1, 200, " Rahul");

    t1.start();
    t2.start();


    
  }
  
}
