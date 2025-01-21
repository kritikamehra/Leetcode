class Solution {
    public boolean checkIfPangram(String sentence) {
        // Approach 1
        
        // HashMap<Character,Integer> mp = new HashMap<>();

        // for(int i = 0; i < sentence.length(); i++) {
        //     char ch = sentence.charAt(i);
        //     mp.put(ch, mp.getOrDefault(ch,0)+1);
        // }

        // if(mp.size() == 26) return true;

        // return false;


        // Approach 2
        int[] arr = new int[26];
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            arr[ch-'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] == 0) return false;
        }

        return true;
    }
}