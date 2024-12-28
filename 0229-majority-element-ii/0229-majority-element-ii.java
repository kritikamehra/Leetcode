class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;
        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1 = 1;
            }

            else if(cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2 = 1;
            }

            else if(ele1 == nums[i])
                cnt1++;

            else if(ele2 == nums[i])
                cnt2++;

            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == ele1)
                cnt1++;
            else if(nums[i] == ele2)
                cnt2++;
        }

        if(cnt1 > (n/3))
            list.add(ele1);
        if(cnt2 > (n/3))
            list.add(ele2);

        return list;
    }
}