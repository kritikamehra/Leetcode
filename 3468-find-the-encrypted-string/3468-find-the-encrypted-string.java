class Solution {
    public String getEncryptedString(String s, int k) {
        String temp = "";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            temp+=s.charAt((i+k)%n);
        }
        return temp;
    }
}