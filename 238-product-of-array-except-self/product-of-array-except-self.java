class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[nums.length];
        int[] suffix= new int[nums.length];

        prefix[0]=1;

        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=suffix[i]*prefix[i];
        }
        return arr;
        
    }
}