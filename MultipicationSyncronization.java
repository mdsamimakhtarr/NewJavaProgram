class Table{
    public  synchronized void  printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
class thread3 extends Thread{
    Table t;
    thread3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class thread4 extends Thread{
    Table t;
    thread4(Table t){

        this.t=t;
    }
    public void run(){

        t.printTable(6);
    }
}
public class MultipicationSyncronization {
    public static void main(String[] args) {
        Table obj=new Table();
        thread3 t3=new thread3(obj);
        thread4 t4=new thread4(obj);
        t3.start();
        
        t4.start();

    }
}

