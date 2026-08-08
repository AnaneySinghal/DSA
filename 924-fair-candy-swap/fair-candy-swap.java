class Solution {
    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int sum1=0;
        int sum2=0;

        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }

        int d= (sum1-sum2)/2;

      

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int diff=arr1[i]-arr2[j];

                if(diff==d) return new int[]{arr1[i],arr2[j]};
                
            }

            
        }

        return new int[]{};
    }
}