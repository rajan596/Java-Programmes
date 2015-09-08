
/**
 *
 * @author RAJAN
 */

/*
Generic method works only on Classes , not on premitive datatypes
*/

public class GenericMethod {
    
    static<T> void Display(T[] a) {
        
        for(int i=0;i<a.length ; i++) {
            System.out.println(a[i] + " ");
        }
    }
    
    public static void main(String args[]) {
        Integer no[] = new Integer[3];
        no[0]=1;
        no[1]=2;
        no[2]=3;
        
        Display(no);
        
        String s[] = new String[3];
        s[0]="Milk";
        s[1]="Biscuit";
        s[2]="Maggi";
        
        Display(s);
    }
}
