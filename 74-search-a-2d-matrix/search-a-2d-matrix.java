class Solution {
    public boolean binarySearch(int[][]nums, int target , int row ){
        int low=0;
        int high=nums[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[row][mid]==target) return true;
            else if(nums[row][mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] nums, int target) {
        int n=nums.length;
        int m=nums[0].length;

        int start_row=0;
        int end_row=n-1;

        while(start_row<=end_row){
            int mid_row=start_row+(end_row-start_row)/2;

            if(target>=nums[mid_row][0] && target<=nums[mid_row][m-1]){
                return binarySearch(nums,target,mid_row);
            }
            else if(target>nums[mid_row][m-1]){
                start_row=mid_row+1;
            }
            else{
                end_row=mid_row-1;
            }
        }
        return false;
    }
}