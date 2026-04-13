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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root == null) return pre;
        inorder(pre,root);
        return pre;
    }
    public static void inorder(List<Integer> pre, TreeNode root){
        if(root == null) return;
        inorder(pre,root.left);
        inorder(pre, root.right);
        pre.add(root.val);
    }
}