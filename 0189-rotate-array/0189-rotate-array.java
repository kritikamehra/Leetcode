class Solution {
    public void rotate(int[] arr, int k) {
        if(k == 0)
            return;

        int n = arr.length;
        k = k % n;

        if(k > n)
            return;

        int temp[] = new int[k];

        for(int i = n-k; i < n; i++) {
            temp[i-n+k] = arr[i];
        }

        for(int i = n-k-1; i >= 0; i--) {
            arr[i+k] = arr[i];
        }

        for(int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}