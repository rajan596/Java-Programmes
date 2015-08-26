/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class StaticKeyword {
    public static void main(String args[]) {
        Persons p1=new Persons();
        Persons.showTotalRegistrations();
        
        Persons p2=new Persons();
        Persons.showTotalRegistrations();
        
        Persons p3=new Persons();
        Persons.showTotalRegistrations();
        
    }
}

class Persons() {
    static int totalRegistration=0;
       
    /* Executes only 1 time  */
    static {
        totalRegistration=100;
    }
    
    /* Executes while new object is created */
    Persons() {
        totalRegistration++;
    }
    
    /* we can use only static variables inside static method */
    /* Only 1 copy will be created for all objects of class */
    public static void showTotalRegistrations() {
        System.out.println(totalRegistration);  
    }
}


