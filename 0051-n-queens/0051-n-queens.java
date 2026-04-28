class Solution {
    private List<List<String>> res = new ArrayList<>();
    private boolean[] cols, d1, d2;
    public List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];
        d1 = new boolean[2 * n];
        d2 = new boolean[2 * n];
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');
        dfs(0, n, board);
        return res;
    }
    private void dfs(int r, int n, char[][] b) {
        if (r == n) {
            List<String> s = new ArrayList<>();
            for (char[] row : b) s.add(new String(row));
            res.add(s);
            return;
        }
        for (int c = 0; c < n; c++) {
            if (cols[c] || d1[r - c + n] || d2[r + c]) continue;
            b[r][c] = 'Q';
            cols[c] = d1[r - c + n] = d2[r + c] = true;
            dfs(r + 1, n, b);
            cols[c] = d1[r - c + n] = d2[r + c] = false;
            b[r][c] = '.';
        }
    }
}