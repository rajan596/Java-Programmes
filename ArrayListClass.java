/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RAJAN
 */

import java.util.ArrayList;   // same as vector in c++

public class ArrayListCLass {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        
        a.add("red");
        a.add(0,"black");
        a.add(0,"yellow");
        
        a.clear();
        boolean cont=a.contains("red");
        
        a.add("Mumbai");
        a.add("Delhi");
        a.add("Chennai");
        
        int indx=a.indexOf("Delhi");
        System.out.printf("Index of Delhi : %d\n",indx);
        
        a.remove("Chennai");
        
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
        
    }
}
