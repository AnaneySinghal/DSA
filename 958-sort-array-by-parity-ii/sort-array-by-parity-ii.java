class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] arr =new int[n];
        
        int i=0;
        int j=1;

        for(int x:nums){
            if(x%2==0){
                arr[i]=x;
                i+=2;
            }
            else{
                arr[j]=x;
                j+=2;
            }
        }
        return arr;
        
    }
}