import java.util.*;
class arrlist
{
public static void main (String args[])
{
ArrayList a1=new ArrayList();
a1.add("1");
a1.add(2);
a1.add(1.34);
a1.add(3);
a1.add(4);
a1.add(5);
a1.add(6);

System.out.println("Show Table :"+a1);
System.out.println("Size Showing:"+a1.size());
System.out.println(a1.isEmpty());
System.out.println(a1.contains("1"));
System.out.println(a1.get(2));

a1.set(2,"3456");
System.out.println(a1);

a1.remove(2);
System.out.println(a1);

a1.clear();
System.out.println(a1);
}
}