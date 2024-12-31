class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        if(intervals.length == 1)
            return intervals;

        int s = intervals[0][0];
        int e = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){

            if(intervals[i][0] <= e) {
                if(intervals[i][0] < s) {
                    s = intervals[i][0];
                }
                if(intervals[i][1] > e) {
                    e = intervals[i][1];
                }
            }
            else {
                int[] temp = {s,e};
                res.add(temp);
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }

        // return res.toArray();
         // Add the last interval
        res.add(new int[]{s, e});

        // Convert the list to a 2D array and return
        return res.toArray(new int[res.size()][]);
    }
}