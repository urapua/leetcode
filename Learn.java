package javase17.exceptions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author KatjizeuV
 **/
public class Learn {
    public static void main(String[] args){

//        int[] nums = [...]; // Input array
//        int val = ...; // Value to remove
//        int[] expectedNums = [...]; // The expected answer with correct length.
//        // It is sorted with no values equaling val.
//
//        int k = removeElement(nums, val); // Calls your implementation
//
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];
//        }
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int length = nums.length;

        System.out.println("Initial number of values is: "+length);

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == val && i <= nums.length -1){
                for (int y = i; y <= nums.length -1; y++){
                    if(y == nums.length -1)
                        nums[y] = 0;
                    else {
                        if(nums[y] == nums[y+1])
                            i -= 1;
                            else
                                nums[y] = nums[y+1];
                    }


                }
                length--;
            }
        }
        System.out.println("At the end the number of values are: "+ length);
        for (int z:nums) {
            System.out.print(z+ " ");
        }
        System.out.println("");
    }


}


