class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size(); 
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            
            result.add(0, list);
        }
        
        return result;
    }
}