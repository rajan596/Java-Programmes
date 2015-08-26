/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class InheritanceDemo {
        public static void main(String args[]) {
            Person3 p1=new Person3("xyz",19,100);
            BusinessMan bm1=new BusinessMan("a",10,100,"x",1000);  
            bm1.getInfo();
            
            
            B b=new B();
            
            Person3 pp=new BusinessMan("aaaa",10,100,"yyyyy",1000));

        }
}

class Person3 {
    String name;
    int age;
    int height;
    
    Person3(String name , int age , int height) {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    
    
    public void info() {
        System.out.println("Name : " + name + "\nAge : " + age + "\nHeight : "+height );
    }
}

class BusinessMan extends Person3{
    String company;
    int salary;
    
    BusinessMan(String name , int age , int height , String company , int salary){
        super(name , age , height);   /* calling parent class's constructor */
        this.company=company;
        this.salary=salary;
    }
    
    public void getInfo() {
        super.info();
        System.out.println("Company :" + company+  "\nSalary : " + salary );
    }
}

class A{
    A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    B() {
        System.out.println("Class B Constructor");
    }
}
