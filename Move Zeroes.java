Question:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Solution:

class Solution {
    public void moveZeroes(int[] nums) {
 
        int j=0;
        for(int i:nums){
            if(i!=0){
                nums[j++]=i;
                
            }
        }
        while(j<nums.length){
            nums[j++]=0;
            
        }
    }
}
