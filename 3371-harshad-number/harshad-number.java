class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;

        int original=x;
        while(x!=0){
            int ld=x%10;
            sum+=ld;
            x=x/10;

          
        }

          if(original%sum==0) {
            return sum;
        }
        return -1;
        
        
    }
}