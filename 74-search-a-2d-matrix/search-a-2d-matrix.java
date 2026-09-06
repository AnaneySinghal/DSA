class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int low=0;
        int high=(nums.length * nums[0].length)-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            int row=mid/nums[0].length;
            int col=mid%nums[0].length;

            if(nums[row][col]==target) return true;
            else if(nums[row][col]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
        
    }
}