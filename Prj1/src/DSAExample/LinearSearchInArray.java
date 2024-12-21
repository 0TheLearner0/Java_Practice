package DSAExample;

public class LinearSearchInArray {
	
	public static void main(String[] ar) {
		
		int m=0;
		int[] numbers= {1000,200,3000,20,65,75,85,650,1050,14};
		int target=140;
		
		boolean found=false;

		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==target)
			{
				System.out.println("Number has been found at index "+i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Number hasn't been found");
		}
	
		
	}

}
