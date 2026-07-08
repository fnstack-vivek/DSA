/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val==p.val||root.val==q.val) return root;
        boolean pleft=exists(root.left,p.val);
        boolean qleft=exists(root.left,q.val);
        if(pleft && qleft) return lowestCommonAncestor(root.left,p,q);
        else if(!pleft && !qleft) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    private boolean exists(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return exists(root.left,val) || exists(root.right,val);
    }
}