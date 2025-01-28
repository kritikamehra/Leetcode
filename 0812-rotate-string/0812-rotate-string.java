class Solution {
    public boolean rotateString(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        if(n1 != n2)    return false;
        s = s+s;
        return s.contains(t);
    }
}