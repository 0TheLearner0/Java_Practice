package DSAExample;

public class BinarySearchInArray {
	public static void main(String[] ar)
	{
		int[] numbers = {10, 20, 30, 40, 50,65,120,130,140,650};
        int target = 6500;

        // Binary Search
        int left = 0, right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow
            if (numbers[mid] == target) {
                System.out.println("Element " + target + " found at index " + mid);
                found = true;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
		
}

}
