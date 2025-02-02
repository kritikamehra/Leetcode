class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
        }

        int maxo = Integer.MIN_VALUE, maxe = Integer.MIN_VALUE;
        int mino = Integer.MAX_VALUE, mine = Integer.MAX_VALUE;
        for(char ch: mp.keySet()) {
            if(mp.get(ch)%2 != 0) {
                maxo = Math.max(maxo,mp.get(ch));
            }
            else {
                mine = Math.min(mine,mp.get(ch));
            }
        }
         return maxo-mine;
    }
}