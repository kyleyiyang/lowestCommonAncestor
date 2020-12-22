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
        int min = 0; int max = 0;
        if (p.val<q.val) {min = p.val;max = q.val;}
        else {min = q.val;max = p.val;}
        return recur(root,min,max); 
    }
    public static TreeNode recur(TreeNode r, int min, int max) {
        if ((r.val>min & r.val < max) || r.val == min || r.val == max) return r;
        else if (r.val < min) return recur(r.right,min,max);
        else if (r.val > max) return recur(r.left,min,max);
        return r;
    }
}
