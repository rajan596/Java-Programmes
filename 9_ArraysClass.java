/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArraysClass;

/**
 *
 * @author RAJAN
 */

import java.util.Arrays;

public class ArraysClass {
    
    public static void main(String[] args) {
        
        int a[]={10,20,50,40,20};
        int b[]={10,20,20,40,50};
        
        Arrays.sort(a);
        int location=Arrays.binarySearch(a,40);
        boolean isequal=Arrays.equals(a,b);
        Arrays.fill(a, 7);
        
        System.arraycopy(a,0, b,0, a.length);
    }
    
}
