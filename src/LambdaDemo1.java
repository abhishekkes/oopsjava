//functional interface
@FunctionalInterface
interface NumericTest{
    abstract boolean test(int n);
}
public class LambdaDemo1 {
    public static void main(String args[]) {

        NumericTest isEven= (n) -> (n%2)==0;

       if(isEven.test(4))
       {
           System.out.println("Even");
       }
       else
           System.out.println("ODD");
    }
}