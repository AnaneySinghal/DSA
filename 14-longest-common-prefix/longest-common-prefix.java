class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];
        String ans="";

        for(int i=0;i < first.length() && i < last.length();i++){
            char ch1=first.charAt(i);
            char ch2=last.charAt(i);
            if(ch1==ch2) ans+=ch1;
            else break;
        }
        return ans;
        
    }
}