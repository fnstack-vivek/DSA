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
// 
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {   // order fix
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, preorder);
    }
    
    public TreeNode build(int plo, int phi, int inlo, int inhi, int[] inorder, int[] preorder) {
        if (plo > phi || inlo > inhi) return null;
        int val = preorder[plo];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }
        int count = r - inlo;
        root.left = build(plo+1, plo+count, inlo, r-1, inorder, preorder);
        root.right = build(plo+count+1, phi, r+1, inhi, inorder, preorder);
        return root;
    }
}