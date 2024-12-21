//                                        String Buffer
//                                       ii-Insert
package StRing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class StrBufferInsert {
   public static void main(String g[])
   {
	   StringBuffer sb=new StringBuffer("");
	   sb.append("Zishan");
	   System.out.println(sb);
	   System.out.println("--------------");
	   sb.insert(sb.length(),"Khan");
	   System.out.println(sb);
   }
}
