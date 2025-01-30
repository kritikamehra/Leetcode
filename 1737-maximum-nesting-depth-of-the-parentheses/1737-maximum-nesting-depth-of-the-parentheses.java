class Solution {
    public int maxDepth(String s) {
        int ans = -1;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push('(');
            }
            else if(s.charAt(i) == ')') {
                st.pop();
            }

            ans = Math.max(ans,st.size());
        }
        return ans;
    }
}