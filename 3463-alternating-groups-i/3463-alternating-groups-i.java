class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int i = 0, j = 1, k = 2, count = 0;
        if(colors[i] != colors[j] && colors[i] != colors[colors.length-1])  count++;
        if(colors[i] != colors[colors.length-1] && colors[colors.length-2] != colors[colors.length-1])  count++;
        for(;k < colors.length; i++, j++, k++){
            if(colors[i] != colors[j] && colors[j] != colors[k])
                count++;
        }

        return count;
    }
}