
class A{
    void wish(){
        System.out.println(" hello good morning");

    }
}
class B extends A{
    void greet(){
        System.out.println("hii samim ");
    }
}
class C extends A{
    void name(){
        System.out.println("samim akhtar");
    }

}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
       C  ca=new C();
       B bb=new B();
        ca.name();
        ca.wish();
        bb.greet();

    }
}
