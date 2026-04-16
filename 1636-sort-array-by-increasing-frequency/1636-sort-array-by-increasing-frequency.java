// class Solution {
//     public int[] frequencySort(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer,Integer> freq = new HashMap<>();
//         for(int nu : nums){
//             freq.put(nu,freq.getOrDefault(nu,0)+1);
//         }
//         Integer temp[] = new Integer[n];
//         for(int i = 0; i<n;i++){
//             temp[i] = nums[i];
//         }
//         Arrays.sort(temp, new Comparator<Integer>(){
//             public int compare(Integer a, Integer b){
//                 if(freq.get(a) == freq.get(b)){
//                     return b-a; //dec order
//                 }
//                 return freq.get(a) - freq.get(b); //inc orderr
//             }
//         });
//         for(int i = 0; i<n;i++){
//             nums[i] = temp[i];
//         }
//         return nums;
//     }
// }
class Solution {
public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) {
        freq.put(n, freq.getOrDefault(n, 0) + 1);
    }

    Integer[] temp = new Integer[nums.length];
    for (int i = 0; i < nums.length; i++) {
        temp[i] = nums[i];
    }

    Arrays.sort(temp, (a, b) -> {
        int f1 = freq.get(a);
        int f2 = freq.get(b);
        if (f1 != f2) {
            return f1 - f2; // Inc frqq
        }
        return b - a; // Dec frwq
    });

    for (int i = 0; i < nums.length; i++) {
        nums[i] = temp[i];
    }
    
    return nums;
}
}