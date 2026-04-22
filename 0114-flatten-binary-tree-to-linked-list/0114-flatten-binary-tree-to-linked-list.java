// class Solution {
//     private TreeNode prev = null;

//     public void flatten(TreeNode root) {
//         if (root == null) return;

//         flatten(root.right);
//         flatten(root.left);

//         root.right = prev;
//         root.left = null;
//         prev = root;
//     }
// }
class Solution {
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        
        while (cur != null) {
            if (cur.left != null) {
                TreeNode temp = cur.right;
                
                cur.right = cur.left;
                cur.left = null;
                
                TreeNode tl = cur.right;
                while (tl.right != null) {
                    tl = tl.right;
                }
                
                tl.right = temp;
            }
            
            cur = cur.right;
        }
    }
}