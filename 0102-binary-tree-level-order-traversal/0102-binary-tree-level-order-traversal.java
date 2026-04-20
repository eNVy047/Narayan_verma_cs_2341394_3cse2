class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        queue.offer(root); // both works offer and add

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll(); // do not use pop baby it is not in quee ll
                list.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            result.add(list);
        }

        return result;
    }
}