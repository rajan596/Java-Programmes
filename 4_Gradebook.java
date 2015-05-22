/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class GradeBook{
    private String book;
    
    public GradeBook(String bookname) {
        book=bookname;
    }
    
    public void get() {
        System.out.printf("Book name : %s\n",book);
    }
    
    public void set(String bookname) {
        book=bookname;
    }
}


// Driver Programme ........................................................................................Demo.java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

public class Demo{
    public static void main(String[] args) {
        GradeBook g1=new GradeBook("Physics");
        g1.get();
        g1.set("Chemistry");
        g1.get();
    }
    
}


