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
    public boolean isSymmetric(TreeNode root) {
       if (root == null) {
            return true;
        }
        return  check(root.left,root.right);
    }
    public boolean check(TreeNode ln,TreeNode rn ){
        if(ln == null && rn == null) return true;
        if(ln == null || rn == null || ln.val != rn.val) return false;
        boolean v1 = check(ln.left,rn.right);
        boolean v2 = check(ln.right,rn.left);
        return v1 && v2;
    }
}