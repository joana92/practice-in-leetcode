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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null)
        return result;
        List<Integer>path = new ArrayList<Integer>();
        helper(root,result,path,0,sum);
     return result;
    }
    public void helper(TreeNode root, List<List<Integer>> result, List<Integer>path, int pSum,int sum)
    {
        if(root==null)
        {
            if(pSum==sum)
            result.add(new ArrayList<Integer>(path));
            return;
        }
        
        pSum+=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null)
        {
            helper(null,result,path,pSum,sum);
        }
        if(root.left!=null)
        {
            helper(root.left,result,path,pSum,sum);
            path.remove(path.size()-1);
        }
        if(root.right!=null)
        {
            helper(root.right,result,path,pSum,sum);
            path.remove(path.size()-1); 
        }
    }
}