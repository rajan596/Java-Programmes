/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        for(Book book:Book.values()) {
            System.out.printf("%10s %8s\n",book.getTitle(),book.getCopyrightYear());
        }
       
        System.out.println("Range ::");
        for(Book book: EnumSet.range(Book.TCS, Book.DBMS)) {
            System.out.printf("%10s %8s\n",book.getTitle(),book.getCopyrightYear());
        }
        
    }
}
