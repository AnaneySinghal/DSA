class Solution {
    // boolean isAlphaNum(char ch){
    //     if((ch>='a' && ch<='z')||
    //      (ch>='A' && ch<='Z')||
    //       (ch>='0' && ch<='9')){
    //         return true;
    //       } 
    //       return false;
    // }
    public boolean isPalindrome(String s) {
       int left=0 , right=s.length()-1;

       while(left<right){
        char l=s.charAt(left);
        char r=s.charAt(right);

        if(!Character.isLetterOrDigit(l)){
            left++;
        }
        else if(!Character.isLetterOrDigit(r)){
            right--;
        }
        else{
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
                left++;
                right--;
        }
       }
       return true;
        
    }
}