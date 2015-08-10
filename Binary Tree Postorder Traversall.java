public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack <TreeNode> s1=new Stack<>();
        Stack <TreeNode> s2=new Stack<>();
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        TreeNode node= root;
        s1.push(node);
        while(!s1.empty()){
          node=s1.pop();
          if(node.left!=null)
          s1.push(node.left);
          if(node.right!=null)
          s1.push(node.right);
          s2.push(node);
        }
        while(!s2.empty()){
            result.add(s2.pop().val);
        }
        return result;
        
    }
}
