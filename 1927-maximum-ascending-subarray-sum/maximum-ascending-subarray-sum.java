class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_sum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                max_sum=Math.max(max_sum,sum);
                sum=nums[i];
            }
        }
        max_sum=Math.max(sum,max_sum);

        return max_sum;
        
    }
}