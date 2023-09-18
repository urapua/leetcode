package leetcode;

public class RemoveElement {

	public static void main(String[] args) 
	{
		
		int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int length = nums.length; //this will keep the number of elements to consider in the array
        
		System.out.printf("The value to remove in the array is:%d%n",val);
		
		 
		for(int i = 0; i < nums.length; i++) 
		{
			if(nums[i] == val && i < length -1) 
			{
				int y = i;
				while(y < nums.length-1)
				{
					nums[y] = nums[y+1];
					y++;
				}
				if(nums[i] == val) 
				{
					i--;  // it reduces i to cater for values which occur consecutively in an array 
				}
				length--;
			}
			else if(nums[i] == val && i == length -1) // this takes care of indexoutofbounds error.
			{
				nums[i] = 0;
				length--;
			}
			
		}
		
		System.out.printf("The new size of the array is:%d%n",length);
		for(int y = 0; y < nums.length; y++) 
		{
			System.out.printf("The value at array[%d] is %d%n",y,nums[y]);
		}
		// TODO Auto-generated method stub

	}

}
