class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int count_zero=0;
        int max_len=0;
        int len=0;
        while(right<nums.length){
            if(nums[right]==0){
                count_zero++;
            }
            if(count_zero>k){
                if(nums[left]==0){
                    count_zero--;
                    
                }
                left++;
            }
            if(count_zero<=k){
                len=right-left+1;
                max_len=Math.max(len,max_len);
            }
            right++;
        }
        return max_len;
        
    }
}