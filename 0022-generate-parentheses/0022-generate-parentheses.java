class Solution {
    void func(List<String> ans, int open, int close, String temp, int n) {
        if(open == n && close == n) {
            ans.add(temp);
            return;
        }

        if(open < n) {
            temp=temp+"(";
            func(ans,open+1,close,temp,n);
            temp = temp.substring(0,temp.length()-1);
        }

        if(close < open) {
            temp = temp+")";
            func(ans,open,close+1,temp,n);
            temp = temp.substring(0,temp.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        int open = 0, close = 0;
        List<String> ans = new ArrayList<>();
        func(ans, open, close, "", n);
        return ans;
    }
}