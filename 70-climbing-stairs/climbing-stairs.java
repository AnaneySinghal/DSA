class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return count(n);
        
    }
    int count(int n){
        if(n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=count(n-1)+count(n-2);
    }
}