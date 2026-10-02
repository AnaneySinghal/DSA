class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int max_diff=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                max_diff=Math.max(max_diff,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return max_diff;
        
    }
}