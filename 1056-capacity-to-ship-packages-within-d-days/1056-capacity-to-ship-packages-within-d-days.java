class Solution {
    public boolean isPossible(int[] weights, int days, int mid) {
        int count = 0, daycount = 1;
        for(int i = 0; i < weights.length; i++) {
            // if(weights[i] > mid) //HANDLED BY SETTING MAX ELEMENT AS THE INITIAL LOW
            count += weights[i];
            if(count > mid) {
                daycount++;
                count = weights[i];
            }
            if(daycount > days) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = Arrays.stream(weights).sum(), ans = -1;
        
        for(int i = 0; i < weights.length; i++)
            low = Math.max(low,weights[i]);

        while(low<=high) {
            int mid = low+(high-low)/2;
            boolean check = isPossible(weights, days, mid);
            if(check) {
                ans = mid;
                high = mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}