class Solution {
    public void sortColors(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length-1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }

            else if(arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

            else mid++;
        }
    }
}