class Solution {

    public boolean check(int[] piles, int k, int h) {
        int count = 0;
        for(int i = 0; i < piles.length; i++) {
            // if(piles[i] <= k) count++;
            count += piles[i]/k + (piles[i]%k != 0?1:0);

            if(count > h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxele = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++) {
            maxele = Math.max(maxele,piles[i]);
        }

        int low = 1, high = maxele, ans = maxele;

        while(low <= high) {
            int mid = low+(high-low)/2;
            boolean flag = check(piles, mid, h);
            if(flag) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}