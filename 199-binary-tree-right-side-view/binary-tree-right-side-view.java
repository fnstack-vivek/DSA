/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        view(root,0,ans);
        return ans;
        }
        private void view(TreeNode root,int levels,List<Integer> ans){
            if(root==null) return;
            if(levels>=ans.size()) ans.add(root.val);
            else ans.set(levels,root.val);
            view(root.left,levels+1,ans);
            view(root.right,levels+1,ans);


        }

}