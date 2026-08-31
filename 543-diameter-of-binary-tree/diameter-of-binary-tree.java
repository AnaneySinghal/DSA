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
     int level(TreeNode root){
        if(root==null) return 0;
        int leftLevel=level(root.left);
        int rightLevel=level(root.right);
        return 1+Math.max(leftLevel,rightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a=level(root.left)+level(root.right);
        int b=diameterOfBinaryTree(root.left);
        int c=diameterOfBinaryTree(root.right);
        return Math.max(a,Math.max(b,c));
        
    }
}