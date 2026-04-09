class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int digi1 = 0;
        int digi2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == digi1) {
                count1++;
            } 
            else if (num == digi2) {
                count2++;
            } 
            else if (count1 == 0) {
                digi1 = num;
                count1 = 1;
            } 
            else if (count2 == 0) {
                digi2 = num;
                count2 = 1;
            } 
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == digi1) count1++;
            else if (num == digi2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) result.add(digi1);
        if (count2 > n / 3) result.add(digi2);

        return result;
    }
}