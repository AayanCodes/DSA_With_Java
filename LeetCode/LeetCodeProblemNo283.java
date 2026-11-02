// 283. Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
 
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }
    }
}


// VSCode Solution 

public class LeetCodeProblemNo283 {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    movesZeroes(nums);
    System.out.println("Output: ");

  for (int num : nums) {
    System.out.println(num + " ") ;
  }
}
  public static void movesZeroes(int[] nums) {

    int index = 0;

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {

        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;

        index++;
      }
    }
  }
}

// OUTPUT 

Output: 1 3 12 0 0

  
