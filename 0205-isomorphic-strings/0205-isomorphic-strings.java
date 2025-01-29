class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length() != t.length())  return false;
        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            if(mp.containsKey(s.charAt(i))) {
                if(t.charAt(i) != mp.get(s.charAt(i))) return false;
            }
            else {
                if(hs.contains(t.charAt(i)))    return false;
                else {
                    hs.add(t.charAt(i));
                    mp.put(s.charAt(i),t.charAt(i));
                }
            }
        }

        return true;
    }
}