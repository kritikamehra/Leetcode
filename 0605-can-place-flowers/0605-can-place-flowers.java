class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) i++;
            else {
                if((i-1 < 0 || arr[i-1] != 1) && ( i+1 >= arr.length || arr[i+1] != 1)) {
                    count++;
                    arr[i] = 1;
                }
            }
        }

        if(count >= n)  return true;

        return false;
    }
}