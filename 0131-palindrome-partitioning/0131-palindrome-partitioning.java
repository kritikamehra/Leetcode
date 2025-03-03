class Solution {
    public boolean palindrome(String temp) {
        int i = 0, j = temp.length()-1;
        while(i<j) {
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    public void helper(String s, List<List<String>> ans, List<String> str, String temp, int index) {

        if(index == s.length()) {
            ans.add(new ArrayList<>(str));
            return;
        }

        for(int i = index; i < s.length(); i++) {
            temp = temp+s.charAt(i);
            boolean check = palindrome(temp);
            if(check) {
                str.add(temp);
                helper(s, ans, str, "", i+1);
                str.remove(str.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> str = new ArrayList<>();
        String temp = "";
        helper(s, ans, str, temp, 0);
        return ans;
    }
}