class Solution {
    public boolean detectCapitalUse(String s) {
        int upperCase=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isUpperCase(ch)) upperCase++;
        }

        if((upperCase==0)
        ||(upperCase==s.length())
        ||(upperCase==1 && Character.isUpperCase(s.charAt(0))) )return true;
        return false;
        
    }
}