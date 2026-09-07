class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
       
        int count_zero=0;

 // r ko 0 se n-1 tk chalao or jese hi 0 mile
 // count_zero ko increase kro
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) count_zero++;
        
// count_zero jese hi k se bda ho jaye left ko bhadao
// or jese hi left ko 0 mile count ko decrease kro
// last me r pointer n k equal hi jaega or widnow ki len n-left k equal ho jayegi
        if(count_zero>k){
            if(nums[left]==0) count_zero--;
            left++;
        }
        
        }
         
        return nums.length-left;
    }
}