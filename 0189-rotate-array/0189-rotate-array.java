// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         int[] arr = new int[n];
//         for(int i = 0; i < n ; i++){
//             arr[(i+k)%n] = nums[i];
//         }
//         for(int i = 0; i < n ; i++){
//             nums[i] = arr[i];
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0 ,n-1);
        reverse(nums,0 ,k -1);
        reverse(nums,k ,n-1);
    };
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}