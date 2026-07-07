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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        boolean leftToright=true;
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int size=q.size();
             List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode front=q.remove();
                // TreeNode node=q.remove();
               if(leftToright)
                level.add(front.val);
               else{
                   level.add(0,front.val);

                   
               }
               if(front.left!=null) q.add(front.left);
               if(front.right!=null){
                q.add(front.right);
               }
            }
        
        ans.add(level);
        leftToright=!leftToright;}
        return ans;
        
    }
}