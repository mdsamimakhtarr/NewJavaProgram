class Bank{
    private   String BankName;
    private  String ifsc_code;
    private double AccountNumber;
    private String AccountHolderName;
    private double Balance;


    public void setBankDetails(String B_name,String code ,double AccountNO,String AccountHolder,double Bal){
        BankName=B_name;
        ifsc_code=code;
        AccountNumber=AccountNO;
        AccountHolderName=AccountHolder;
        Balance=Bal;

    }
    public void getDetails(){
        System.out.println("The Name of the Bank is "+BankName);
        System.out.println("The ifsc code is "+   ifsc_code);
        System.out.println("The Account Number is "+ AccountNumber);
        System.out.println("THe Account Holder name is "+ AccountHolderName);
        System.out.println("The Balance is "+Balance);
    }

}

public class BankEncaptulation {
    public static void main(String[] args) {
        Bank e1=new Bank();
        Bank e2=new Bank();
        e2.setBankDetails("SBI","SBI12345678PIYT",789456123,"MD SAMIM AKHTAR",100000);
        e1.setBankDetails("YESBANK","SBI12345678KJUGCB ",789478913,"RAHUL SAKSENA ",200000);
         e1.getDetails();
        System.out.println("================================================");
         e2.getDetails();

    }
}
