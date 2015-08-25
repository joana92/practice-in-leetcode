public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        TreeNode curnode;
        int cursum;
        LinkedList<TreeNode> node= new LinkedList<>();
        LinkedList<Integer> valsum=new LinkedList<>();
        node.add(root);
        valsum.add(root.val);
        while(!node.isEmpty()){
            curnode=node.poll();
            cursum=valsum.poll();
            if(curnode.left!=null){
                node.add(curnode.left);
                valsum.add(cursum+curnode.left.val);
            }
            if(curnode.right!=null){
                node.add(curnode.right);
                valsum.add(cursum+curnode.right.val);
            }
            if(curnode.left==null && curnode.right==null){
                if(cursum==sum) return true;
            }
        }
        return false;
    }
}
