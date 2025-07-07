class Solution {
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(List<List<String>> ans, List<String> temp, String s, int index) {
        if(index >= s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        String str = "";
        for(int i = index; i < s.length(); i++) {
            str+=s.charAt(i);
            if(isPalindrome(str)) {
                temp.add(str);
                solve(ans, temp, s, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(ans, temp, s, 0);
        return ans;
    }
}