class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if(smap.containsKey(s_ch)) {
                if(smap.get(s_ch) == t_ch && tmap.containsKey(t_ch) && tmap.get(t_ch) == s_ch)
                    continue;
                else return false;
            }

            else if(tmap.containsKey(t_ch)) return false;
            else {
                smap.put(s_ch, t_ch);
                tmap.put(t_ch, s_ch);
            }
        }
        return true;
    }
}