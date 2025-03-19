class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int i=0;
        HashSet<List<Integer>> hs = new HashSet<>();
        while(i<l) {
            int j=i+1, k=l-1;
            while(j<k) {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0) {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    hs.add(al);
                    j++;
                    k--;
                }
                else if(sum < 0)
                    j++;
                else
                    k--;
            }
            i++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> al : hs) {
            ans.add(al);
        }
        return ans;
    }
}