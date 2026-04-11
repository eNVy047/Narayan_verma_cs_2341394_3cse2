class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pind = 0;
        int nind = 1;
        for(int num : nums){
            if(num > 0){
                arr[pind] = num;
                pind +=2;
            }else{
                arr[nind] = num;
                nind +=2;
            }
        }
        return arr;
    }
}