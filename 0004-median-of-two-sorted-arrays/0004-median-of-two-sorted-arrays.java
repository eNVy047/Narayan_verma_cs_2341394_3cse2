import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        int[] result = new int[n + m];
        
        for (int i = 0; i < n; i++) {
            result[i] = nums1[i];
        }
        
        for (int i = 0; i < m; i++) {
            result[n + i] = nums2[i];
        }

        Arrays.sort(result);

        int len = result.length;

        if (len % 2 == 1) {
            return result[len / 2];
        } 
        
        else {
            return (result[len / 2 - 1] + result[len / 2]) / 2.0;
        }
    }
}