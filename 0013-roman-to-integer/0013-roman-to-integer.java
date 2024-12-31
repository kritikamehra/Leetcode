class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp= new HashMap<>();
        mp.put('M',1000);
        mp.put('D',500);
        mp.put('C',100);
        mp.put('L',50);
        mp.put('X',10);
        mp.put('V',5);
        mp.put('I',1);

        int n = s.length();
        int sum = mp.get(s.charAt(n-1));
        int val = mp.get(s.charAt(n-1));
        for(int i = n-2; i >= 0; i--) {
            int temp = mp.get(s.charAt(i));
            if(temp < val) {
                sum-=temp;
            }
            else
                sum+=temp;

            val = temp;
        }

        return sum;
    }
}