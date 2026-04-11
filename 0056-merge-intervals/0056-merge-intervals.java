class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
        List<int[]> ans = new ArrayList<>();
        int[] cur = intervals[0];
        ans.add(cur);
        for(int i = 1; i < intervals.length; i++){
            int[] temp = intervals[i];
            if(cur[1] >= temp[0]){
                cur[1] = Math.max(cur[1], temp[1]);
            } else{
                cur = temp;
                ans.add(cur);
            }
        }
        
        return ans.toArray(new int[0][]);
    }
    // public static int[][] merge(int[][] intervals) {
    //     Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
    //     List<int[]> ans = new ArrayList<>();
    //     int start = intervals[0][0];
    //     int end = intervals[0][1];
    //     int n = intervals.length;
    //     for(int i = 1; i < n; i++){
    //         int cur_start = intervals[i][0];
    //         int cur_end = intervals[i][1];
    //         if( end >= cur_start){
    //             end= Math.max(end,cur_end);
    //         } else {
    //             ans.add(new int[]{start, end});
    //             start = cur_start;
    //             end = cur_end;
    //         }
    //     }
    //     ans.add(new int[]{start, end});
    //     return ans.toArray(new int[0][]);
    // }
}