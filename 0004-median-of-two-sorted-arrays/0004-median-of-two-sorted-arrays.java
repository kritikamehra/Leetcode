class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1 = nums1.length, l2 = nums2.length;
        int mid = (l1+l2)/2;
        int ind1 = -1, ind2 = -1;

        if((l1+l2)%2 == 0) {
            ind1 = mid-1;
            ind2 = mid;
        }
        else {
            ind1 = mid;
            ind2 = mid;
        }

        int cnt = 0, ele1 = -1, ele2 = -1, i = 0, j = 0;
        while(i < l1 && j < l2) {
            int temp = 0;
            if(nums1[i] <= nums2[j]) {
                if(cnt == ind1) ele1 = nums1[i];
                if(cnt == ind2) ele2 = nums1[i];
                cnt++;
                i++;
            }
            else {
                if(cnt == ind1) ele1 = nums2[j];
                if(cnt == ind2) ele2 = nums2[j];
                cnt++;
                j++;
            }
        }

        while(i < l1) {
            if(cnt == ind1) ele1 = nums1[i];
            if(cnt == ind2) ele2 = nums1[i];
            cnt++;
            i++;
        }

        while(j < l2) {
            if(cnt == ind1) ele1 = nums2[j];
            if(cnt == ind2) ele2 = nums2[j];
            cnt++;
            j++;
        }

        return (double)(ele1+ele2)/2.0;
    }
}