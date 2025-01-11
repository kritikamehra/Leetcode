class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1, ans = -1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int missing_num = arr[mid]-(mid+1);
            if(missing_num < k) low = mid+1;
            else high = mid-1;
        }
        return k+high+1;
    }
}