class Solution {
    public int fib(int n) {
        double ans=(1+Math.sqrt(5))/2;
        return (int) Math.round(Math.pow(ans,n)/Math.sqrt(5));
    }
}