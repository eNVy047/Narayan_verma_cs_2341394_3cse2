class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i += 2 * k) {
            reverse(chars, i, Math.min(i + k - 1, chars.length - 1));
        }
        
        return new String(chars);
    }

    public static void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}