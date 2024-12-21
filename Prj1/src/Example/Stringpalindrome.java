package Example;

public class Stringpalindrome {
       public static void main(String arg[])
       {
    	   String str="Book ";
    	   String str1="";
    	   int l;
    	   l=str.length();
    	   for(int i=l-1;i>=0;i--)
    	   {
    		   str1=str1+str.charAt(i);
    	   }
    	   if(str.equalsIgnoreCase(str1))
    		   System.out.println(str+" is palindrome String");
    	   else
    		   System.out.println(str+" is not palindrome String");
       }
}
 