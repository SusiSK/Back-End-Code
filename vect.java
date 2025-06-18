import java.util.*;

class vect
{
public static vid main (String args[])
{

Vector v=new Vector();
v.addElement("c++");
v.addElement("java");
v.addElement("python");
System.out.println(v);

v.insertElementAt("2");
System.out.println(v);

v.removeElementAt(2);
System.out.println(v);

System.out.println(v.firstElement());
System.out.println(v.lstElement());
System.out.println(v.indexOf("c#"));
System.out.println(v.elementAt(2));
int size=v.size();
String s[]=new String[size];
v.copyInto(s);
for(int i=0;i<size;i++)
{
System.out.println(s/i);
}
}
}