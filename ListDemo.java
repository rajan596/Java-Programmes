/**
 *
 * @author RAJAN
 */


public class ListDemo<T>{
        
     int size;
     int pos=0;
     T[] list;
   
    ListDemo(int sz) {
        list=(T[]) new Object[sz];
        size=sz;
        pos=0;
    }
    
    public void add(T a) {
        if(pos < size) {
            list[pos++]=a;
        } else {
            System.err.println("Size limit");
        }
    }
    
    public void showList() {
        String result = "";
        
        for(int i=0;i<pos ; i++) {
            result += list[i] + "  "; 
        }
        
        System.out.println(result);
    }
    
    public static void main(String args[]) {
        ListDemo<String> l=new ListDemo<String>(20);
        l.add("milk");
        l.add("egg");
        l.add("Biscuit");
        l.showList();
        
        ListDemo<Integer> l2=new ListDemo<Integer>(20);
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.showList();
    }
    
    
}
