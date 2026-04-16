import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int count : freq.values()) {
            if (set.contains(count)) {
                return false;
            }
            set.add(count);
        }

        return true;
    }
}