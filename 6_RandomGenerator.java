/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import java.util.Random;

public class RandomGenerator {
    
    public static void main(String[] args) {
        Random randomNumber=new Random();
       
        int i=5,
            a=0;

        
        while(i>=0) {           
          a=5 + 2*randomNumber.nextInt(6); // 5 + 2*[0,5]
          //number = shiftingValue + differenceBetweenValues * randomNumbers.nextInt( scalingFactor );
          
          System.out.printf("%d\n",a);
          i--;
        }
    }
    
    
}
