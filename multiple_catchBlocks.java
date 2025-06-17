public class multiple_catchBlocks {
    public static void main(String[] args) {
          try{
              int[] numbers={12,13,14};
              System.out.println(numbers[5]);
              int a=10/0;
              System.out.println(a);
          }catch (ArrayIndexOutOfBoundsException e ){
              System.out.println("Error index out of index ");
          }
          catch(ArithmeticException a ){
              System.out.println("Error cannot divide by zero ");
          }
          finally{
              System.out.println(" Execution completed without Exception ");
          }
    }
}
