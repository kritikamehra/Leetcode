class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "", temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(st.size() >= 1)  
                    temp = temp+s.charAt(i);
                st.push('(');  
            }
            else {
                if(st.size() > 1) {
                    temp = temp+s.charAt(i);
                    st.pop();
                }
                else {
                    ans = ans+temp;
                    temp = "";
                    st.pop();
                }
            }
        }
        return ans;
    }
}