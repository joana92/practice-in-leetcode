public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        Stack<TreeNode> tree= new Stack<>();
       if(root==null) return result;
        TreeNode cur= root;
       // tree.push(cur);
        while(cur!=null || !tree.empty()){
            while(cur!=null){
                tree.push(cur);
                cur=cur.left;
            }
            cur=tree.pop();
            result.add(cur.val);
            cur=cur.right;
        }
     return result;   
    }
}
