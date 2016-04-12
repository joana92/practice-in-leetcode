/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        traversal(root,result);
        return result;
        
    }
    public void traversal(TreeNode root,List<Integer>result){
        if(root==null)
        return;
        traversal(root.left,result);
        result.add(root.val);
        traversal(root.right,result);
        
    }
}