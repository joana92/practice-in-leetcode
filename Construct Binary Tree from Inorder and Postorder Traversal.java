public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len1=inorder.length;
        int len2=postorder.length;
        if(len1==0 | len2==0)
        return null;
        return TreeNodeHelper(inorder,0,len1-1,postorder,0,len2-1);
    }
    public TreeNode TreeNodeHelper(int [] in,int instart,int inend, int []post, int pstart, int pend){
        if(instart==inend) return new TreeNode(in[instart]);
        if(instart>inend | inend<0 | pend<0) return null;
        TreeNode root= new TreeNode(post[pend]);
        int in_root_index=instart;
        for(int i=instart;i<=inend;i++){
            if(in[i]==root.val)
           { in_root_index=i;
           break;}
        }
        if(in_root_index==0) root.left=null;
        root.left= TreeNodeHelper(in,instart,in_root_index-1,post,pstart,pstart+in_root_index-instart-1);
        root.right=TreeNodeHelper(in,in_root_index+1,inend,post,pstart+in_root_index-instart,pend-1);
        return root;
    }
}
