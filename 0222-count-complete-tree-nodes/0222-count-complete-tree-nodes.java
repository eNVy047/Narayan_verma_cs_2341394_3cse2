/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int count = 0;
        
        if (root == null) return count;
        que.offer(root);
        
        while (!que.isEmpty()) { 
            TreeNode cur = que.poll(); 
            count++;
            if (cur.left != null) que.offer(cur.left);
            if (cur.right != null) que.offer(cur.right);
        }
        
        return count;
    }
}