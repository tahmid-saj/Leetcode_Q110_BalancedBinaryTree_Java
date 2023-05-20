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
    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            if (isBalanced(root.left) == false) {
                return false;
            }

            if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
                return false;
            }

            if (isBalanced(root.right) == false) {
                return false;
            }
        }

        return true;
    }
}
