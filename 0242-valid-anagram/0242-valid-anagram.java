class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> smp = new HashMap<>();
        // HashMap<Character,Integer> tmp = new HashMap<>();

        // for(int i =0 ; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     smp.put(ch, smp.getOrDefault(ch, 0)+1);
        // }

        // for(int i =0 ; i < t.length(); i++) {
        //     char ch = t.charAt(i);
        //     tmp.put(ch, tmp.getOrDefault(ch, 0)+1);
        // }

        // if(smp.equals(tmp))  return true;

        // return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        if(Arrays.equals(s1,t1))    return true;
        return false;
    }
}