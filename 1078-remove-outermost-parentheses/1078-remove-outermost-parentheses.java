class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push('(');
                if(st.size() > 1)
                    temp = temp+ch;   
            }
             else if(ch == ')') {
                if(st.size() > 1)
                    temp = temp + ch;
                st.pop();
            }
        }
        return temp;
    }
}