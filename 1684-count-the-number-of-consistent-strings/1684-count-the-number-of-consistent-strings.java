class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            ok[ch - 'a'] = true;
        }

        int count = 0;

        for (String w : words) {
            boolean valid = true;

            for (char ch : w.toCharArray()) {
                if (!ok[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) count++;
        }

        return count;
    }
}