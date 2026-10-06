class Solution {
    public boolean isAlphNum(char ch){
        if((ch>='a' && ch<='z')||
        (ch>='A' && ch<='Z')||
        (ch>='0' && ch<='9')) return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            char start=s.charAt(i);
            char end =s.charAt(j);

            if(!isAlphNum(start)) i++;
            else if(!isAlphNum(end))j--;
            else{
                if(Character.toLowerCase(start)!=Character.toLowerCase(end)) return false;
                i++;
                j--;
            }
        }
        return true;
        
    }
}