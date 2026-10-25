class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){

            cnt+=n&1;
            n=n>>1;
            // if((n & 1)==1) cnt++;
            // n=n>>1;

            // if(n%2==1) cnt++;
            // n=n/2;
        }
        
        return cnt;
        
    }
}