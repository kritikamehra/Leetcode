class Solution {
    public int search(int[] arr, int key) {
        int l=0, h=arr.length-1;
        while(l <= h) {
            int m = l+(h-l)/2;
            if(arr[m]==key)
                return m;
            else if(arr[m]<key)
                l++;
            else
                h--;
        }
        return -1;
    }
}