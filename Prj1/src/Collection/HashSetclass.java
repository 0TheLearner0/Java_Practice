package Collection;
import java.util.*;
import java.io.*;
import java.util.Collections;
import java.io.*;
class HashSetclass
{
public static void main(String x[])throws IOException
{
int i,n,ch;
String str;
Boolean st=false;
Scanner sc=new Scanner(System.in);
HashSet<String> hs=new HashSet<String>();
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
ch=sc.nextInt();
switch(ch)
{
case 1:	
System.out.println("enter term");
 n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter string");
str=br.readLine();
hs.add(str.toUpperCase());
}
break;
case 2:
if(hs.isEmpty())
{
System.out.println("there is no element in hashset");
break;
}
System.out.println("display string");
System.out.println("total string="+hs);
System.out.println("display string");
Iterator it=hs.iterator();
while(it.hasNext())
{
String s=(String)it.next();
System.out.println(s);
}
break;
case 3:
System.exit(0);
case 4:
System.out.println("enter any string");
str=br.readLine();
Iterator it1=hs.iterator();
while(it1.hasNext())
{
String s=(String)it1.next();
//if(s.compareToIgnoreCase(str))
st=hs.remove(str);
if(st==true)
{
System.out.println("remove word successfully");
break;
}
}
if(st==false)
System.out.println("name not found");
else
{
System.out.println("after deleting string");
System.out.println("string="+hs);
}
break;
case 5:
System.out.println("enter any string");
str=br.readLine();
st=hs.contains(str.toUpperCase());
if(st==true)
{
System.out.println("string="+hs);
System.out.println("string exist");
}
else
System.out.println("element not found");
break;
case 6:
hs.clear();
System.out.println("all the element of hash set has been removed");
break;
case 7:
System.out.println("string="+hs);
System.out.println("total no of element in hashset="+(hs.size()));
break;
case 8:
st=false;
System.out.println("enter any string");
str=br.readLine();
str=str.toUpperCase();
st=hs.contains(str);
if(st==true)
{
hs.remove(str);
System.out.println("enter new string");
str=br.readLine();
st=hs.add(str.toUpperCase());
System.out.println("after modifing string="+hs);
}
else
System.out.println("element not found");
break;
case 9:
System.out.println("before sorting");
System.out.println("string="+hs);
//for each loop
for(String str1 : hs)
{
System.out.println(str1);
}
//treeSet=sorting string
TreeSet<String> ts=new TreeSet<String>(hs);
System.out.println("after sorting");
//for each loop
for(String str1 : ts)
{
System.out.println(str1);
}
System.out.println("sort string="+ts);
break;
default:
System.out.println("invalid choice");
}
}while(2>1);
}
}

