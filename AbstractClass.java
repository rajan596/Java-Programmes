/*
# Description

1. Incomplete class
2. We can't make object of Abstract class
3. child class must complete parent abstract class as parent is incomplete 
*/
public class AbstractClass {
    public static void main(String args[]) {
        X obj=new X();
        obj.print1();
        obj.print2();
    }
}

abstract class A2 {
    abstract public void print1();
}

abstract class B2 extends A2{
    abstract public void print2();
}

class X extends B2{

    @Override
    public void print2() {
        System.out.println("Print 2 ");
    }

    @Override
    public void print1() {
        System.out.println("Print 1");
    }
    
}

