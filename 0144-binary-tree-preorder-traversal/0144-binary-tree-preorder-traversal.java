class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root == null) return pre;
        preOrder(pre,root);
        return pre;
    }
    public static void preOrder(List<Integer> pre, TreeNode root){
        if(root == null) return;
        pre.add(root.val);
        preOrder(pre,root.left);
        preOrder(pre, root.right);
    }
}