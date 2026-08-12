class Solution {
    public boolean canPlaceFlowers(int[] arr, int t) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                boolean empty_left=((i==0 || arr[i-1]==0));
                boolean empty_right=((i==n-1) || arr[i+1]==0);

                if(empty_left && empty_right){
                    arr[i]=1;
                    count++;
                }
            }
        }
        return count>=t;
    }
}