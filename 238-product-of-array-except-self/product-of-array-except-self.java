class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int[] arr = new int[nums.length];
        int[] suffix= new int[nums.length];

       arr[0]=1;

        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
            arr[i]*=suffix[i];
        }
        return arr;
        
    }
}