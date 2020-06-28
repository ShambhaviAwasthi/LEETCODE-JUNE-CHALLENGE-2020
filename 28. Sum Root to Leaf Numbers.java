// SHAMBHAVI AWASTHI
// JUNE LEETCODE CHALLENGE 2020
// DAY 28 : Sum Root to Leaf Numbers

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
    int sumPath(TreeNode root,int value){
        if(root == null)
            return 0;
        value=value*10+root.val;
        if(root.left == null && root.right==null)
            return value;
        return (sumPath(root.left,value)+sumPath(root.right,value));
    }
    public int sumNumbers(TreeNode root) {
        return sumPath(root,0);
    }
}
