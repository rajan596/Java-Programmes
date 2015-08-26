/**
 *
 * @author RAJAN
 *
 * Final Keyword : 
 * 1. To prevent other programmers from creating sub classes or from overriding certain methods.
 * 
 * O/P:: 
 * 
 * I am daddy cool..I am boss
 * I am daddy cool..
 * 
 */

public class FinalKeyword {
    public static void main(String args[]) {
        Child c=new Child();
        c.msg();
        
        Daddy d=new Daddy();
        d.message();
    }
}

class Daddy {
    
    /* constatnt variable */
    public final double pi=3.14;
    
    public final void message() {
        System.out.println("I am daddy cool..");
    }
}

class Child extends Daddy {
    /*
    Can't do this:
    
    void message() {
        System.out.println("I am daddy cool..I am boss");
    }
    */
    
    public void msg() {
        System.out.println("I am daddy cool..I am boss");
    }
    
}

/*can't make sub classes  */
final class Winner{
    System.out.println("Can't extend this class");
}
