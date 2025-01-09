class Solution {

    public boolean isPossible(int[] bloomDay, int m, int k, int days) {
        int flower_count = 0, m_count = 0;
        for(int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= days) flower_count++;
            else flower_count = 0;

            if(flower_count == k) {
                m_count++;
                flower_count = 0;
            }
        }
        if(m_count < m) return false;
        return true;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int minele = Integer.MAX_VALUE, maxele = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length; i++) {
            minele = Math.min(bloomDay[i], minele);
            maxele = Math.max(bloomDay[i], maxele);
        } 

        int low = minele, high = maxele, ans = -1;
        if(m*k > bloomDay.length) return ans;

        while(low <= high) {
            int mid = low+(high-low)/2;
            boolean check = isPossible(bloomDay, m, k, mid);
            if(check) {
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}