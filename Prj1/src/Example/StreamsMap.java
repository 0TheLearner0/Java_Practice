package Example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamsMap {
  public static void main(String arg[])
  {
	  List<Integer>numberList=new ArrayList<>();
	  numberList.add(10);
	  numberList.add(20);
	  numberList.add(30);
	  numberList.add(40);
	  
	  List<Integer>squareList=numberList.stream().map(x -> x*x).collect(Collectors.toList());

	  //	  or

//	  List<Integer>squareList=new ArrayList<>();
//	  for(Integer i:numberList)
//	  {
//		  squareList.add(i*i);
//	  }
	  
	  System.out.println("List of Square number: "+squareList);
	  
  }
}
