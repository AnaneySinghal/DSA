class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder sb =new StringBuilder(s.concat(s));
         return sb.toString().contains(goal);

        
    }
}