class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] seen = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            seen[ch-'a']=true;
        }
        for(boolean bool :seen){
            if(bool!=true)return false;
        }
        return true;
    }
}