class pair {
        int f;
        char ch;
        pair(int f,char ch) {
            this.f = f;
            this.ch = ch;
        }
    }
class Solution {
    
    public String frequencySort(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.f - a.f);
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        Set<Character> hs = mp.keySet();
        for(char ch: hs) {
            int val = mp.get(ch);
            pq.add(new pair(val,ch));
        }

        String ans="";
        while(!pq.isEmpty()) {
            pair p = pq.remove();
            for(int i = 0; i < p.f; i++)
                ans = ans+p.ch;
        }
        return ans;
    }
}