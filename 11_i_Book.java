/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

public enum Book {
    
    // declaring constants of enum type
    TCS("Theory of Computer Science","2011"),
    DBMS("Database Management System","2012"),
    ED("Engineering Drawing","2013");
    
    private final String title;
    private final String copyrightyear;
    
    Book(String booktitle,String year) {
        title=booktitle;
        copyrightyear=year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getCopyrightYear() {
        return copyrightyear;
    }
    
}
