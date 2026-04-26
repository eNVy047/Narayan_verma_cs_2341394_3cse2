class Solution {
    int[] dp = new int[10001];
    public int coinChange(int[] coins, int amount) {
        Arrays.fill(dp, -2);
        return solve(coins, amount);
    }
    public int solve(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (dp[amount] != -2) return dp[amount];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int ans = solve(coins, amount - coin);
            if (ans >= 0) min = Math.min(min, ans + 1);
        }
        return dp[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
    }
}