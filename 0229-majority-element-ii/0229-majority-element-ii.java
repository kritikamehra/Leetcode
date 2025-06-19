class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        }

        int ele1 = Integer.MAX_VALUE, cnt1 = 0;
        int ele2 = Integer.MIN_VALUE, cnt2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;
            else if(cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        //check
        int c1 = 0, c2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == ele1) c1++;
            else if(nums[i] == ele2) c2++;
        }

        int n = nums.length;

        if(c1 > n/3)
            ans.add(ele1);

        if(c2 > n/3)
            ans.add(ele2);

        return ans;
    }
}