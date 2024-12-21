package Example;

public class PracticeArray {

 public static void main(String ar[])
 {
	 String[] strArr=new String[10];
	 for(int i=strArr.length-1;i>=0;i--)
	 {
		 strArr[i]="b"+(i-1);
	 }
	 System.out.println("Value: "+strArr[1]);
 
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
	 
	 double[] dblArr= {3.5,6.8,2.3,9.1,1.0};
 
 for(int i=0;i<dblArr.length;i++)
 {
	 dblArr[i]/=2;
 }
 for(int i=dblArr.length-1;i>=0;i--)
 {
	 System.out.println("Value: "+dblArr[i]);
 }
 
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
	 
 int[] intArr= {1,2,3,4,5};
 double[] dblAr= {.5 , 1, 1.5, 2, 2.5};
   for(int i=0;i<intArr.length;i++)
   {
	   dblAr[i]=dblAr[i] * intArr[i];
   }
 for(int i=0;i<intArr.length;i++)
 {
	 System.out.println(intArr[i]+ ": "+dblAr[i]);
	 
 }
 
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
 
 int[] n= {1,2,3,4,5,6,7,8,9,10};
 for(int i=0;i<n.length;i += 3)
 {
	 System.out.println("Value: "+n[i]);
	
 }
 
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
 
 int[] n1= {1,2,3,4,5,6,7,8,9};
 //Before Debugging 
 //for(i=0;i<=9;i+=2) Array has only 0-8 indices and into the condition area we have mention the 9th indices which isn't possible.Because we have already declared that there's only 8 indices. 
 //After Debugging
 for(int i=1;i<=8;i += 2)
	 
 {
	 System.out.println(n1[i]+", ");
 }
 
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<");
 
 String[] str=new String[5];
 String sep="";
 for(int i=0;i<str.length;i++)
 {
	 System.out.print(sep+str[i]);
	 sep=", ";
 }
 System.out.println("");
 System.out.println(" >>>>>>>>>>>>>><<<<<<<<<<<<<<<<<");
 
 int[] n2=new int[5];
 for(int i=0;i<n2.length;i++)
 {
	 n2[i]=i*2;
 }
 for(int i=0;i<n2.length;i++)
 {
	 System.out.println(n2[i]+", ");
 }
 System.out.println(" >>>>>>>>>>>>>>>>>>>>>><<<<<<<<<");
 
 //Declare and instantiate on a single line a one-dimensional array called strArrr that holds 50 Strings
 String[] Arrr=new String[50];
 //Declare on one line and instantiate on a second line a one-dimensional array that holds 50 String
 String[] Ar;
 Ar=new String[50];
 //Initialize every position in Str to a backlash. Do not hardcode the length of the array in any way
 String[] Str1=new String[5];
 for(int i=0;i<Str1.length;i++)
 {
	 Str1[i]="\\";
 }
 
 //
 
 
 

 
 
 }
	
}
