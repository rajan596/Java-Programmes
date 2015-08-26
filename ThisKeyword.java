/**
 *
 * @author RAJAN
 */
public class ThisKeyword {
    
    public static void main(String args[]) {
            Person p1=new Person(100);
            p1.showBalance();
    }

}

class Person {
    int money=50;
    
    Person(int money) {
        this.money=money;   // here this=object_name
    }
    
    public void showBalance() {
           System.out.println(this.money);
    }
}
