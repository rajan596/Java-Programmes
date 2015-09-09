package TreeSetDemo;

import java.util.TreeSet;

/**
 *
 * @author RAJAN
 */
public class TreeSetDemo {
    
    public static void main(String args[]) {
        TreeSet<String> names=new TreeSet<String>();
    
        names.add("aa");
        names.add("ba");
        names.add("ca");
        
        System.out.println("Size : " + names.size());
        
        for(String n : names) {
            System.out.println(n);
        }
        
        System.out.println("Higher : " + names.higher("ba"));
        System.out.println("Lower : " + names.lower("ba"));
    }
}
