class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '*') {
                st.push(ch);
            } else {
                st.pop();
            }
        }

        String ans = "";

        // First traversal
        Stack<Character> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        // Second traversal
        while (!temp.isEmpty()) {
            ans += temp.pop();
        }

        return ans;
    }
}