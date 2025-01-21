class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        if(mp.size() == 26) return true;

        return false;
    }
}