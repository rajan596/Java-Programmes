/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
public class InterfaceX implements codeX,codeY{
    public static void main(String arga[]) {
        //a=5;   // can't modify interface variables they are constant
        
        InterfaceX i=new InterfaceX();
        i.display();
        i.show();
    }        

    @Override
    public void display() {
        System.out.println("This is codeX interface\n");
    }

    @Override
    public void show() {
        System.out.println("This is codeY interface");
    }
}

interface codeX {
    int a=3;  /*can't modify later*/
    public void display();
}

interface codeY {
    int b=35;
    public void show();
}
