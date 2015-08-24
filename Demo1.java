/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class Demo1 {
    
    public static void main(String args[]){
          XYZ p=new XYZ();
          System.out.println(p);   // Output : XYZ@1f5b44d6 . So object actually stores address of the class instance. 
                                  //Just like pointer in C++
    }
}

class XYZ
{
    int a=5;
}
