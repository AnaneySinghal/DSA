class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;

        double max_avg=avg;

        int l=0;
        int r=k-1;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            
            avg=sum/k;

            max_avg=Math.max(avg,max_avg);
        }
        return max_avg;
        
    }
}