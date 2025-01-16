class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if(mp.containsKey(ch)) mp.put(ch, mp.get(ch)+1);
            else mp.put(ch, 1);
        }

        for(int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if(mp.containsKey(ch)) count += mp.get(ch);
        }

        return count;
    }
}