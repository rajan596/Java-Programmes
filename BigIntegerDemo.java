
import java.math.BigInteger;

/**
 *
 * @author RAJAN
 */
public class BigIntegerDemo {
    
    public static void main(String args[]) {
        BigInteger n=new BigInteger("100000000000000000000000000");
        
        // available variables
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TEN);
        System.out.println(BigInteger.ZERO);
        
        //
        BigInteger sum,multiply,div;
        
        sum=n.add(n);
        multiply=n.multiply(n);
        div=n.divide(n);
        
        System.out.println("SUM : " + sum);
        System.out.println("MUL : " + multiply);
        System.out.println("DIV : " + div);
        
        for(BigInteger x=BigInteger.ZERO ; x.compareTo(n)<=0 ; x=x.add(BigInteger.ONE)) {
            System.out.println(x);
        }
    }
}
