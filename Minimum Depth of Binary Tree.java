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
    public int minDepth(TreeNode root) {
        if(root==null) 
        return 0;
        ArrayList<TreeNode> currlevel, nextlevel;
        int count=1;
        currlevel= new ArrayList<TreeNode>();
        currlevel.add(root);
        while(!currlevel.isEmpty()){
            nextlevel=new ArrayList<>();
            for(TreeNode e:currlevel){
                if(e.left==null & e.right==null)
                return count;
                else{
                  if(e.left!=null)  nextlevel.add(e.left);
                  if(e.right!=null) nextlevel.add(e.right);
                    //count++;
                }
            }
            currlevel=nextlevel;
            count++;
        }
        return count;
        
    }
}
