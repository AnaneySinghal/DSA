class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        char[] arr1=new char[26];
        char[] arr2= new char[26];

        for(int i=0;i<ransomNote.length();i++){
            char ch= ransomNote.charAt(i);
            arr1[ch-'a']++;
        }

        for(int i=0;i<magazine.length();i++){
            char ch= magazine.charAt(i);
            arr2[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]>arr2[i]) return false;
        }
        return true;
        
    }
}