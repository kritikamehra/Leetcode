class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int n = s1.length();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        int i = 0, j = i+1;
        while(i < n && j < n) {
            char ch = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = ch;

            if(Arrays.equals(arr1,arr2)) return true;

            ch = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = ch;

            j++;

            if(j == n) {
                i++;
                j = i+1;
            }
        }   
        return false;
    }
}