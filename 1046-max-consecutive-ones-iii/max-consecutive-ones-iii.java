class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
       
        int count_zero=0;

        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) count_zero++;
        
        if(count_zero>k){
            if(nums[left]==0) count_zero--;
            left++;
        }
        
        }
         
        return nums.length-left;
    }
}