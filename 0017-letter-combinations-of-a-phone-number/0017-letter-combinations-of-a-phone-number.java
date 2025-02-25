class Solution {
    public void helper(List<String> ans, String digits, String[] letters, int index, String temp) {
        if(index == digits.length()) {
            ans.add(temp);
            return;
        }

        char ch = digits.charAt(index);
        for(int i = 0; i < letters[ch-'0'].length(); i++) {
            temp+=letters[ch-'0'].charAt(i);
            helper(ans, digits, letters, index+1, temp);
            temp = temp.substring(0,temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        helper(ans, digits, letters, 0, "");
        return ans;
    }
}