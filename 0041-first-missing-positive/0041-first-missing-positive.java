class Solution {
    public int firstMissingPositive(int[] nums) {
        int smp = 1;
        Arrays.sort(nums);
        for(int nu : nums){
            if(nu > 0){
              if(smp == nu){
                smp++;
              }
            }
        }
        return smp;
    }
}