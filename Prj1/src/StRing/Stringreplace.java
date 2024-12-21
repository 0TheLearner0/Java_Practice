package StRing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringreplace {
     public static void main(String c[])
     {
    	 StringBuffer jk=new  StringBuffer("");
    	 jk.append("Zishan is my name");
    	 System.out.println(jk);
    	 jk.replace(0,4,"Hey");
    	 System.out.println(jk);
     }
}
