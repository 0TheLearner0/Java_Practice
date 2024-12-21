package Collection;

//ArrayList:->it is the class which is used to store data in collection.it contains the value in index
//which starts from zero. it stores duplicate values.
//arraylist class
import java.util.*;
import java.io.*;
class ArrayListclass
{
public static void main(String x[])throws IOException
{
int i,n,ch;
String str;
Boolean st=false;
Scanner sc1=new Scanner(System.in);
ArrayList<String> ls=new ArrayList<String>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("menu");
System.out.println("*****");
System.out.println("1-ADD");
System.out.println("2-DISPLAY");
System.out.println("3-EXIT");
System.out.println("4-DELETE");
System.out.println("5-SEARCH");
System.out.println("6-CLEAR CONTAINS LIST");
System.out.println("7-TOTAL ELEMENT");
System.out.println("8-MODIFY ELEMENT");
System.out.println("9-SORT ELEMENT");
System.out.println("ENTER UR CHOICE");
ch=sc1.nextInt();
switch(ch)
{
case 1:	
System.out.println("enter term");
n=sc1.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter string");
str=br.readLine();
ls.add(str.toUpperCase());
}
break;
case 2:
if(ls.isEmpty())
{
System.out.println("there is no element in arraylist");
break;
}
System.out.println("display string");
System.out.println("total string="+ls);
System.out.println("display string");
Iterator it2=ls.iterator();
while(it2.hasNext())
{
String s=(String)it2.next();
System.out.println(s);
}
break;
case 3:
System.exit(0);
case 4:

Iterator it3=ls.iterator();
System.out.println("enter any string");
str=br.readLine();
while(it3.hasNext())
{
//String s=(String)it1.next();
st=ls.remove(str);
if(st==true)
System.out.println("remove word successfully");
break;
}
if(st==false)
System.out.println("name not found");
else
{
System.out.println("after deleting string");
System.out.println("string="+ls);
}
break;
case 5:
System.out.println("enter any string");
str=br.readLine();
st=ls.contains(str.toUpperCase());
if(st==true)
{
System.out.println("string="+ls);
System.out.println("string exist");
}
else
System.out.println("element not found");
break;
case 6:
ls.clear();
System.out.println("all the element of arraylist has been removed");
break;
case 7:
System.out.println("string="+ls);
System.out.println("total no of element in ARRAYLIST="+(ls.size()));
break;
case 8:
System.out.println("enter any string");
str=br.readLine();
str=str.toUpperCase();
st=ls.contains(str);
if(st==true)
{
ls.remove(str);
System.out.println("enter new string");
str=br.readLine();
st=ls.add(str);
System.out.println("after modifing string="+ls);
}
else
System.out.println("element not found");
break;
case 9:
System.out.println("before sorting");
System.out.println("string="+ls);
for(String str1 : ls)
{
System.out.println(str1);
}
TreeSet<String> ts=new TreeSet<String>(ls);
System.out.println("after sorting");
for(String str1 : ts)  //FOR EACH LOOP
{
System.out.println(str1);
}
System.out.println("string="+ts);
break;
default:
System.out.println("invalid choice");
}
}while(2>1);
}
}

