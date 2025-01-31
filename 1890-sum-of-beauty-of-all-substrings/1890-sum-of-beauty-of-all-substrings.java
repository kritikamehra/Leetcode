class Solution {
    // public int check(String s) {
    //     int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    //     HashMap<Character, Integer> mp = new HashMap<>();
    //     for(int i = 0; i < s.length(); i++) {
    //         mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
    //     }

    //     for(char ch: mp.keySet()) {
    //         max = Math.max(max, mp.get(ch));
    //         min = Math.min(min, mp.get(ch));
    //     }

    //     return max-min;
    // }
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i <s.length(); i++) {
            int freq[] = new int[26];
            for(int j = i; j < s.length(); j++) {
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for(int f: freq) {
                    if(f > 0) {
                    max=Math.max(max,f);
                    min=Math.min(min,f);
                    }
                }
                if(max-min > 0)
                    ans+=(max-min);
            }
        }
        return ans;
    }
}