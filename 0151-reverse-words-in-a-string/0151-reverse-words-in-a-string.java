class Solution {
    public String reverseWords(String s) {
        String sentence = "", word = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                word+=s.charAt(i);
            }
            else {
                if(word.equals(""))
                    continue;
                else {
                    sentence = word + " " + sentence;
                    word = "";
                }
            }
        }

        sentence = word + " " + sentence;
    
        return sentence.trim();
    }
}