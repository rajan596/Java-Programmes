1.	Java is fully Pass by value.
2.	Objcts are actually pointers.
3.	String – String Buffer – String Builder
    >> String :
    o	String is Immutable class. We can’t change modify string once created.
    o	String str=”abc”;  
      str.concat(“d”); 
      still str would be str=”abc”.
  
  	>> StringBuffer :
    StringBuffer str=new StringBuffer("abc");
    str.append("d");
    System.out.println(str); // "abcd"

    >> StringBuilder : 
    -> It is not synchronizes so It can't be used in Threads. StringBuffer is better for this.

4. 
