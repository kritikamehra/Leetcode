class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge without extra space
        int n = nums1.length, m = nums2.length;
        int i = n-1, j = 0;

        while(i >= 0 && j < m) {
            if(nums1[i] > nums2[j]) {
                int temp = nums2[j];
                nums2[j] = nums1[i];
                nums1[i] = temp;
                i--;
                j++;
            }
            else break;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if((m+n)%2 == 0) {
            int f = (m+n)/2-1;
            int c = (m+n)/2;
            int first = 0, second = 0;
            if(f >= n) {
                first = nums2[f-n];
            //     f -= n;
            //     c -= n;
            //     return ((double)nums2[f-1]+nums2[c-1])/2.0;
            }
            else {
                first = nums1[f];
                // return ((double)nums2[0]+nums2[1])/2.0;
            }
            if(c >= n) {
                second = nums2[c-n];
                // return ((double)nums2[f-1]+nums2[c-1])/2.0;   
            }
            else {
                second = nums1[c];
                // return ((double)nums1[n-1]+nums2[0])/2.0;
            }

            return (double)(first+second)/2.0;
        }

        else {
            int mid = (m+n)/2;
            if(mid >= n) {
                mid-=n;
                return nums2[mid];
            }
            else return nums1[mid];
        }
    }
}