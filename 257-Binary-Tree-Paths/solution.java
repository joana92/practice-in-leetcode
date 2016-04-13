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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String path = "";
        helper(root,result,path);
        return result;
    }
    public void helper(TreeNode root,List<String>result,String path)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        {
            path=path+Integer.toString(root.val);
            result.add(path);
            return;
        }
            path=path+Integer.toString(root.val)+"->";
        if(root.left!=null)
        {
            helper(root.left,result,path);
        }
        if(root.right!=null)
        {
            //path=path+root.val+"->";
            helper(root.right,result,path);
        }
    }
}