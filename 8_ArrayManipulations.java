/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class ArrayManipulation {
    
    public static void main(String[] args) {
        int[] a=new int[20];     // fixed length array from 0 to 19
    
        int c[];
        c=new int[10];

        String s[]=new String[20];
        
        int b[]={10,20,30,40,50};
        
        for(int i=0;i<10;i++) {
            try{
                System.out.printf("%d\n",b[i]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        
        System.out.println(b.length);
        
        
        //2 D Array
        
        int x[][]={{1,2},{3,4,5,6}};
        int y[][]=new int[2][];  // creates 2 row
        y[0]=new int[10];
        y[1]=new int[5];
        
        for(int row=0;row<x.length;row++) {
            for(int column=0;column<x[row].length;column++) {
                System.out.printf("%d ",x[row][column]);
            }
            System.out.println(" ");
        }
        
    }
}
