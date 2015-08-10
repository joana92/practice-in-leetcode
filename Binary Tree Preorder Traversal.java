public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack <TreeNode> tree= new Stack<> ();
        List<Integer> result= new ArrayList<>();
        if(root==null) return result;
        tree.push(root);
        while(!tree.empty()){
            TreeNode node= tree.pop();
            result.add(node.val);
            if(node.right!=null)
            tree.push(node.right);
            if(node.left!=null)
            tree.push(node.left);
        }
        return result;
        
    }
}
