public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;

        ArrayList<TreeNode> currLevel, nextLevel;
        currLevel = new ArrayList<TreeNode>();
        currLevel.add(root);

        while (!currLevel.isEmpty()) {
            nextLevel = new ArrayList<TreeNode>();
            ArrayList<Integer> intList = new ArrayList<Integer>();
            for (TreeNode e : currLevel) {
                intList.add(e.val);
                if (e.left != null) nextLevel.add(e.left);
                if (e.right != null) nextLevel.add(e.right);
            }

            ret.add(intList);
            currLevel = nextLevel;
        }
        return ret; 
    }
}
