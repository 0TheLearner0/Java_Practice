package DSAExample;

public class Rough {
	
	public static void main(String[] ar)
	{
		int[] num= {10,20,30,40,50,60,70,80};
		int target=5;
		
		int left=0;int right=num.length-1;
		boolean found=false;
		while(left<=right)
		{
			int mid=left+(right-left)/2;// Avoid Overflow
			
			if(num[mid]==target)
			{
				System.out.println("Element found at index "+mid);
				found=true;
				break;
			}else if(num[mid]<target){
				left=mid+1;
			}else
			{
				right=mid-1;
			}
		}
		if(!found)
			System.out.println("Element not found!");
	}

}
