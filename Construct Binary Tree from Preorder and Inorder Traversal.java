public class Solution {
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(
        int[] preorder, int pre_begin, int pre_end,
        int[] inorder, int in_begin, int in_end) {

        if (pre_begin > pre_end)
            return null;
        TreeNode root = new TreeNode(preorder[pre_begin]);
        int in_index = in_begin;
        for (int i = in_begin; i <= in_end; i++) {
            if (inorder[i] == root.val) {
                in_index = i;
                break;
            }
        }

        root.left = buildTreeHelper(
                preorder, pre_begin + 1, pre_begin + in_index - in_begin,
                inorder, in_begin, in_index - 1);
        root.right = buildTreeHelper(
                preorder, pre_begin + in_index - in_begin + 1, pre_end,
                inorder, in_index + 1, in_end);

        return root;
    }
}
