/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Addition Of Two Numbers :\n");
        
        int a,b,sum = 0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a : ");
        a=input.nextInt();
        
        System.out.println("Enter b : ");
        b=input.nextInt();
        
        sum=a+b;
        System.out.printf("a + b : %d\n",sum);
    }
}
