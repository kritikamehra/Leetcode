class Solution {
    public void swapIfGreater(int[] nums1, int[] nums2, int left, int right) {
        if(nums1[left] > nums2[right]) {
            int temp = nums1[left];
            nums1[left] = nums2[right];
            nums2[right] = temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap = (m+n)/2 + (m+n)%2;

        while(gap > 0) {
            int left = 0, right = left+gap;
            while(right < (n+m)) {
                if(left <m && right >= m) {
                    swapIfGreater(nums1, nums2, left, right-m);
                }

                else if(left < m && right < m) {
                    swapIfGreater(nums1, nums1, left, right);
                }

                else {
                    swapIfGreater(nums2, nums2, left-m, right-m);
                }
                left++;
                right++;
            }

            if(gap == 1) break;
            gap = (gap/2) + (gap%2);
        }

        for(int i = m; i < (m+n); i++) {
            nums1[i] = nums2[i-m];
        }
    }
}