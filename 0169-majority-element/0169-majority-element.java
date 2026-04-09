class Solution {
    public int majorityElement(int[] nums) {
        int digi = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                digi = num;
            }

            if (num == digi) {
                count++;
            } else {
                count--;
            }
        }

        return digi;
    }
}